package com.yunshang.oa.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author: qhy
 * @date: 2024-02-29 11:30
 * 启动应用后访问地址: http://localhost:9900/swagger-ui/index.html 或 http://localhost:9900/doc.html
 */
@Configuration
@EnableWebMvc
@EnableKnife4j
public class Swagger3Config {

    @Bean
    public Docket getRESTfulApi() {

        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yunshang.oa.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("《云尚办公》后端API接口文档")
                .description("## Swagger3 RESTful APIs...")
                .contact(new Contact("develqhy", "www.develqhy.com","develqhy@gmail.com"))
                .version("v2.2.1")
                .termsOfServiceUrl("") // 服务条款
                .build();

    }
}
