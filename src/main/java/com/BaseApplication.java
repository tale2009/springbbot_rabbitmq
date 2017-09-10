package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Stephanie on 2017/9/3.
 */
@SpringBootApplication
public class BaseApplication {
    public static void main(String args[])
    {
        SpringApplication.run(BaseApplication.class,args);
    }
}
