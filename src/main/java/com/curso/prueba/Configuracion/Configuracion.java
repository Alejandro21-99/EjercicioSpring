package com.curso.prueba.Configuracion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Configuracion {

    @Value("${usr}")
    private String usr;

    @Value("${clv}")
    private String clv;

   @Bean
   public DataSource getDataSource(){
       DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
       dataSourceBuilder.url("jdbc:sqlserver://192.168.10.136;databaseName=Autolote;TrustServerCertificate=True;");
       dataSourceBuilder.username(usr);
       dataSourceBuilder.password(clv);
       return dataSourceBuilder.build();
   }


}
