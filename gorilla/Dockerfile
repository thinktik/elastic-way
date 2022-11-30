# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/
# https://docs.aws.amazon.com/AmazonECS/latest/bestpracticesguide/application.html
# https://juejin.cn/post/7074981052233711647

# 多CPU架构(AMD64,ARM64)构建
# docker buildx build --platform linux/amd64,linux/arm64 -t thinktik/gorilla:latest . --push

# 多阶段构建: 第一阶段下载依赖并编译
FROM golang:1.18 AS build

# 创建服务器的工作目录
RUN mkdir -p /home/omoz
# 指定工作目录
WORKDIR /home/omoz

# 导入项目全部的源代码
# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/#add-or-copy
COPY ./ /home/omoz
# 设置代理,安装必要的依赖库
RUN go env -w GO111MODULE=on && go env -w GOPROXY=https://goproxy.cn,direct && go mod tidy
# 编译并赋予编辑出的程序本地可执行权限
RUN go build ./app.go && chmod +x ./app


# 多阶段构建: 第二阶段打包镜像
FROM debian:bullseye-slim

# 指定环境变量
ENV HOME_PATH=/home/omoz
ENV APP_NAME=gorilla
ENV PORT=8087

# 安装curl
RUN apt update -y && apt install -y curl && rm -rf /var/lib/apt/lists/*

# 创建服务器的工作目录 & 创建服务器的日志目录
RUN mkdir -p ${HOME_PATH} && mkdir -p /ext_files/logs
# 从上一阶段复制可执行文件
# https://docs.docker.com/develop/develop-images/dockerfile_best-practices/#add-or-copy
COPY --from=build ${HOME_PATH}/app ${HOME_PATH}/app

# 指定工作目录
WORKDIR ${HOME_PATH}

# 暴露的端口号
EXPOSE ${PORT}

# 周期性健康检查
# https://docs.docker.com/engine/reference/builder/#healthcheck
HEALTHCHECK --start-period=180s --interval=60s --timeout=8s --retries=3 CMD curl -s -f localhost:${PORT}/ping || exit 1

# 使用该镜像来启动容器,指定启动命令
ENTRYPOINT ["./app"]