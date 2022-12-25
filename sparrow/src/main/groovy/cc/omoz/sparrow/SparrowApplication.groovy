package cc.omoz.sparrow

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class SparrowApplication {

    static void main(String[] args) {
        SpringApplication.run(SparrowApplication, args)
    }

}
