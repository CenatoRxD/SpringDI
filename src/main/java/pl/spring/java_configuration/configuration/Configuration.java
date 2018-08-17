package pl.spring.java_configuration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@org.springframework.context.annotation.Configuration
@ComponentScan("pl.spring.java_configuration.components") //for search components
@PropertySource("classpath:props.properties") // load properties
public class Configuration {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
