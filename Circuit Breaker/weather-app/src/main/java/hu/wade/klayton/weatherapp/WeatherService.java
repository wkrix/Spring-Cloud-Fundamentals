package hu.wade.klayton.weatherapp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Walter Krix <wkrix89@gmail.com>
 */
@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "unknown")
    public String getWeather() {
        return restTemplate.getForEntity("http://weather-service/weather", String.class).getBody();
    }

    public String unknown(){
        return "unknown";
    }
}
