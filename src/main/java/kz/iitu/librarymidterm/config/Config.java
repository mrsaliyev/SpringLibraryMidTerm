package kz.iitu.librarymidterm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("kz.iitu.librarymidterm")
@PropertySource("application.properties")
public class Config {
}
