package net.inthemoon.tests.injectproperties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created on 24.03.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DatabaseTest.Config.class)
public class DatabaseTest {

   @Configuration
   @ComponentScan(basePackages = { "net.inthemoon.tests.injectproperties" })
   @EnableConfigurationProperties
   public static class Config {
   }

   @Autowired
   public Database database;

   @Test
   public void autowireTest() {

      assertNotNull(database);

      assertEquals("com.mysql.jdbc.Driver", database.getDriverClassName());

   }


}