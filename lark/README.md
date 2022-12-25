# 

## misc

- gradle打包
    - gradle 打包：`./gradlew build`
    - gradle 发布：`./gradlew publish`
- Docker打包
    - docker构建 image：`docker build -t thinktik/lark:latest .`
        - docker构建多架构(X64+ARM64) image 并发布: `docker buildx build --platform linux/amd64,linux/arm64 -t thinktik/lark:latest . --push`
    - docker发布到AWS ECR：`docker image push thinktik/lark:latest`
- AWS ECS
    - 创建AWS ECS任务：`aws ecs register-task-definition --cli-input-json file://ecs_task.json`