package com.example.demo;
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

@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("API de mon projet")
            .description("Description de mon API")
            .license("License de mon API")
            .licenseUrl("localhost:8080/users")
            .termsOfServiceUrl("URL des conditions d'utilisation de mon API")
            .version("1.0.0")
            .contact(new Contact("Nom du contact", "URL du contact", "Email du contact"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2);
                // .select()
                //     .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                //     .paths(PathSelectors.any())
                //     .build()
                // .apiInfo(apiInfo());
    }
}
