package net.inthemoon.tests.injectproperties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "net.inthemoon.tests.injectproperties" })
@EnableConfigurationProperties
public class Config {
}
