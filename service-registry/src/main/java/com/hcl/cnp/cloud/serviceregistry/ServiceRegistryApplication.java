package com.hcl.cnp.cloud.serviceregistry;

/**  
* Description  - Spring BootStrap class for ServiceRegistry    
* @author  anil-g
* @version 1.0 
**/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }
}
