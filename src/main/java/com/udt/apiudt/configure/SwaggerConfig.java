package com.udt.apiudt.configure;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket editableImplementacion(){

        return new Docket(DocumentationType.SWAGGER_2).
                        select().
                        apis(RequestHandlerSelectors.
                        basePackage("ccom.udt.apiudt.controller")).
                        build().
                        apiInfo(apiInfo());
    }
    ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("UDT Generacion Codigo").
                description("API para La udt").
                license("MIT").
                licenseUrl("http://opensource.org/licenses/MIT").
                version("1.0").
                contact(new Contact("Union deportiva","udtoresana.com","udtoresana@gmail.com")).
                build();
    }
}
