package cc.omoz.sparrow

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCaching
@MapperScan("cc.omoz.sparrow.daos.postgresql")
class SparrowApplication {
    static void main(String[] args) {
        SpringApplication.run(SparrowApplication, args)
    }
}