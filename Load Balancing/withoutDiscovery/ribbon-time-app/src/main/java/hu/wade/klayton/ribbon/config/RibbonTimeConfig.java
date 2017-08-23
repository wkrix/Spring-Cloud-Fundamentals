package hu.wade.klayton.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Walter Krix <wkrix89@gmail.com>
 */
@Configuration
public class RibbonTimeConfig {


    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
