package com.ihrm.company;

import com.ihrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

/**
 * @Auth
 * @Describle:
 * @Author: zhangyifei
 * @Date: 2019/5/8
 */

/**
 * 1.配置springboot的包扫描
 */
@SpringBootApplication(scanBasePackages = "com.ihrm")
/**
 * 2.配置jpa注解的扫描
 */
@EntityScan(value = "com.ihrm.domain.company")
/**
 * @Author
 */
public class CompanyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
