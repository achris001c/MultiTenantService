package com.filterexmpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = "com.filterexmpl")
@EnableTransactionManagement(order = 1)
public class MultiTenantApp {

    public static void main(String[] args) {
        SpringApplication.run(MultiTenantApp.class, args);
    }

    private static final Logger logger = LoggerFactory.getLogger(MultiTenantApp.class);

    @PostConstruct
    public void postInit() {
        logger.info("MultiTenant app started!");
    }
}
