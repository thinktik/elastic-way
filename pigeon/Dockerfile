# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/
# https://docs.aws.amazon.com/AmazonECS/latest/bestpracticesguide/application.html

# 多CPU架构(AMD64,ARM64)构建
# docker buildx build --platform linux/amd64,linux/arm64 -t thinktik/sparrow:latest . --push

# 使用JDK17
FROM openjdk:17-slim

# 指定环境变量
ENV HOME_PATH=/home/omoz
ENV APP_NAME=pigeon
ENV PORT=8084

# 标签信息
LABEL "AUTHOR"="ThinkTik"
LABEL "MAIL_ADDRESS"="thinktik@outlook.com"
LABEL "DOMAIN_NAME"="omoz.cc"
LABEL "SERVICE_PATH"="${APP_NAME}"

# 安装curl
RUN apt update -y && apt install -y curl && rm -rf /var/lib/apt/lists/*

# 创建服务器的工作目录 & 创建服务器的日志目录
RUN mkdir -p ${HOME_PATH} && mkdir -p /ext_files/logs

# 将当前项目的可执行文件添加到工作目录
# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/#add-or-copy
ADD ./build/libs/${APP_NAME}-*.jar ${HOME_PATH}/app.jar

# 指定工作目录
WORKDIR ${HOME_PATH}

# 周期性健康检查
# https://docs.docker.com/engine/reference/builder/#healthcheck
HEALTHCHECK --start-period=180s --interval=60s --timeout=8s --retries=3 CMD curl -s -f localhost:${PORT}/ping || exit 1

# 暴露的端口号
EXPOSE ${PORT}

# 使用该镜像来启动容器,指定启动命令
ENTRYPOINT ["java","-jar","app.jar"]