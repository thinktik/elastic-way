# lark

lark：云雀

**功能清单**：

- [ ] 图床
- [ ] 图片水印
  - [ ] 明水印
  - [ ] 暗水印
- [ ] 图片resize
- [ ] 图片格式转换
- [ ] 图片内容审核
- [ ] 图片文字提取
- [ ] 以图搜图
- [ ] AI生成图片


# Arch

**Environment：**

| name   | version                                                        |
|--------|----------------------------------------------------------------|
| Java   | [JDK 17.x](https://www.oracle.com/java/technologies/downloads) |             |


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