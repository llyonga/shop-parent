package cn.llyong.shop;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: lvyong
 * @date: 2019-10-28
 * @time: 10:40 上午
 * @version: 1.0
 */
@EnableApolloConfig
@EnableSwagger2Doc
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class AppGateWay {

    /**
     * 获取Apollo配置
     */
    @ApolloConfig
    private Config config;

    public static void main(String[] args) {
        SpringApplication.run(AppGateWay.class, args);
    }

    // 添加文档来源
    @Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resources = new ArrayList<>();
//            resources.add(swaggerResource("app-member", "/app-member/v2/api-docs", "2.0"));
//            resources.add(swaggerResource("app-weixin", "/app-weixin/v2/api-docs", "2.0"));
//            return resources;
            return resources();
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }

        /**
         * 从阿波罗服务器中获取resources
         *
         * @return
         */
        private List<SwaggerResource> resources() {

            List resources = new ArrayList<>();
            // app-itmayiedu-order
            // 网关使用服务别名获取远程服务的SwaggerApi
            String swaggerDocJson = swaggerDocument();
            JSONArray jsonArray = JSONArray.parseArray(swaggerDocJson);
            for (Object object : jsonArray) {
                JSONObject jsonObject = (JSONObject) object;
                String name = jsonObject.getString("name");
                String location = jsonObject.getString("location");
                String version = jsonObject.getString("version");
                resources.add(swaggerResource(name, location, version));
            }
            return resources;
        }

        /**
         * 获取swaggerDocument配置
         *
         * @return
         */
        private String swaggerDocument() {
            String property = config.getProperty("app.zuul.swaggerDocument", "");
            return property;
        }
    }

}
