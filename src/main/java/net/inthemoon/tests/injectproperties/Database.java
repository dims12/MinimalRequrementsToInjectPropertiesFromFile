package net.inthemoon.tests.injectproperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created on 24.03.2016.
 */
@Component
@ConfigurationProperties
public class Database {

   private static final Logger log = LoggerFactory.getLogger(Database.class);

   private String driverClassName;

   @Value("${database.driver-class-name}")
   public void setDriverClassName(String driverClassName) {
      log.info("setDriverClassName");
      this.driverClassName = driverClassName;
   }

   public String getDriverClassName() {
      return driverClassName;
   }
}
