package com.ge.ren.assetmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
*
* @author Yessesvy
*/
@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"com.ge.ren"})
public class AssetManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetManagementApplication.class, args);
	}

}
