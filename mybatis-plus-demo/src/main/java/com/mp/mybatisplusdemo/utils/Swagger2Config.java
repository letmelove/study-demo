package com.mp.mybatisplusdemo.utils;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述：接口文档配置
 *
 * @author TX
 * @version 1.0
 * @date 2022/02/18
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .groupName("分组1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mp"))
                .paths(PathSelectors.any())
                .build();
    }
    @Bean(value = "createRestApi2")
    public Docket createRestApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .groupName("分组2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mp"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description("knife4j在线API接口文档")
                .contact(new Contact("Roc-xb", "https://yang-roc.blog.csdn.net/", "aida_pc@qq.com"))//可随意填写
                .version("v3.0.0")
                .title("knife4j在线API接口文档")
                .build();
    }

}
