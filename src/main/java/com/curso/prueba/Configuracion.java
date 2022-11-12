package com.curso.prueba;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Configuracion {

   @Bean
   public DataSource getDataSource(){
       DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
       dataSourceBuilder.url("jdbc:sqlserver://192.168.10.136;databaseName=Autolote;TrustServerCertificate=True;");
       dataSourceBuilder.username("UCEM_IRENE");
       dataSourceBuilder.password("1234");
       return dataSourceBuilder.build();
   }


}
