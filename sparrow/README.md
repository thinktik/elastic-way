# sparrow
sparrow：麻雀

集成一些外部的开源数据或者接口

- 为[www.omoz.cc](www.omoz.cc)内部的其他服务提供稳定简便的RPC API
- 再次为互联网用户提供类似服务，降低使用难度

**功能清单**：

- [X] 根据ip查询ip所在的地理位置(依赖[ip2location](https://www.ip2location.com/))
- [ ] IP地址CIDR计算器
- [ ] 天气查询

# Arch
**Environment：**

| name   | version                                                        |
|--------|----------------------------------------------------------------|
| Java   | [JDK 17.x](https://www.oracle.com/java/technologies/downloads) |
| Groovy | [4.x +](https://groovy.apache.org/download.html)               |

![服务集成地图](../doc/sparrow_arch.svg)

# Reference
- ip地理位置数据库: [ip2location](https://www.ip2location.com/)