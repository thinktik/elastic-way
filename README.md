# elastic-way
the way to learn a full elastic containerd backend service

# Arch Design

**Environment**
| name          | version                                                        |
|---------------|----------------------------------------------------------------|
| Java          | [JDK 17.x](https://www.oracle.com/java/technologies/downloads) |
| Groovy        | [4.x +](https://groovy.apache.org/download.html)               |
| Go            | [1.18.x +](https://golang.google.cn/)                          |
| Python        | [3.10.x +](https://www.python.org/)                            |
| Nodejs        | [16.x +](https://nodejs.org/en/)                               |
| CentOS Stream | [9.x +](https://www.centos.org/)                               |

**服务规划和命名**

| name    | version                       |
|---------|-------------------------------|
| birds   | SpringCloud/JDK 17 微服务        |
| mammals | Gin/Go 1.18 web/grpc微服务       |
| snakes  | Flask/Python 3.10 web/grpc微服务 |
| insects | Koa2/Nodejs 16 web/grpc微服务    |

**端口分配表**
| name      | port |
|-----------|------|
| albatross | 8080 |
| lark      | 8081 |
| sparrow   | 8082 |
| eagle     | 8083 |
| pigeon    | 8084 |
| viper     | 8085 |
| bee       | 8086 |
| gorilla   | 8087 |


**网络和VPC设计**
![network&vpc](./doc/network%26vpc.svg)

**架构图**

![arch](./doc/arch.svg)


# Reference

- [AWS ECS](https://aws.amazon.com/cn/ecs/)
- [AWS EKS](https://aws.amazon.com/cn/eks/)
- [AWS App Mesh](https://aws.amazon.com/cn/app-mesh)
- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [腾讯 北极星](https://polarismesh.cn/)
    - [日调用量超三十万亿，腾讯开源百万级服务发现和治理中心北极星](https://cloud.tencent.com/developer/article/1875234)
- [阿里 Nacos](https://nacos.io/zh-cn/)