package cs.se.project.project.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ApplicationConfig
 */
@Configuration
public class ApplicationConfig {


    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    

}