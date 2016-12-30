/**
 * Created by gabkamabka on 2016.12.21..
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    public WithFries withFries(){
        return new WithFries ();}
}

