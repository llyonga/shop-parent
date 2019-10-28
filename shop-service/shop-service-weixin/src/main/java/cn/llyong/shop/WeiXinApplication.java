package cn.llyong.shop;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: llyong
 * @date: 2019/10/26
 * @time: 23:20
 * @version: 1.0
 */
@EnableApolloConfig
@EnableSwagger2Doc
@EnableEurekaClient
@SpringBootApplication
public class WeiXinApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiXinApplication.class, args);
    }
}
