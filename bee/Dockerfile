# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/
# https://docs.aws.amazon.com/AmazonECS/latest/bestpracticesguide/application.html
# https://juejin.cn/post/7074981052233711647

# 多CPU架构(AMD64,ARM64)构建
# docker buildx build --platform linux/amd64,linux/arm64 -t thinktik/bee:latest . --push

# 多阶段构建: 第一阶段下载依赖
FROM node:16 AS build

ENV HOME_PATH=/home/omoz
ENV NODE_ENV production

# 创建服务器的工作目录
RUN mkdir -p ${HOME_PATH}

# 导入项目全部的源代码
# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/#add-or-copy
COPY ./ ${HOME_PATH}
RUN rm -rf ${HOME_PATH}/node_modules

# 指定工作目录
WORKDIR ${HOME_PATH}

# 安装依赖
RUN npm ci --only=production

# 多阶段构建: 第二阶段打包镜像
FROM node:16-slim

# 指定环境变量
ENV HOME_PATH=/home/omoz
ENV NODE_ENV production
ENV APP_NAME=bee
ENV PORT=8086

# 标签信息
LABEL "AUTHOR"="ThinkTik"
LABEL "MAIL_ADDRESS"="thinktik@outlook.com"
LABEL "DOMAIN_NAME"="omoz.cc"
LABEL "SERVICE_PATH"="${APP_NAME}"

# 安装curl
RUN apt update -y && apt install -y curl && rm -rf /var/lib/apt/lists/*

# 创建服务器的工作目录 & 创建服务器的日志目录
RUN mkdir -p ${HOME_PATH} && mkdir -p /ext_files/logs
# 从上一阶段复制可执行文件
# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/#add-or-copy
COPY --from=build ${HOME_PATH} ${HOME_PATH}

# 指定工作目录
WORKDIR /${HOME_PATH}

# 周期性健康检查
# https://docs.docker.com/engine/reference/builder/#healthcheck
HEALTHCHECK --start-period=180s --interval=60s --timeout=8s --retries=3 CMD curl -s -f localhost:${PORT}/ping || exit 1

# 暴露的端口号
EXPOSE ${PORT}

# 使用该镜像来启动容器,指定启动命令
ENTRYPOINT  ["node", "bin/www" ]

