package cn.edu.zucc.accountcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.edu.zucc.accountcenter.dao")
@SpringBootApplication
public class AccountcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountcenterApplication.class, args);
    }

}
