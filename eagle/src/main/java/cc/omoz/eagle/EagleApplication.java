package cc.omoz.eagle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("cc.omoz.eagle.daos.mysql")
public class EagleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EagleApplication.class, args);
    }

}
