package org.example.Wiem_LSI3_SOA_TP6;

import org.example.web.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
    @Bean
    public ResourceConfig resourceConfig()
    {ResourceConfig jersyServlet = new ResourceConfig();
        jersyServlet.register(CompteRestJaxRSAPI.class);
        return jersyServlet;
    }
}
