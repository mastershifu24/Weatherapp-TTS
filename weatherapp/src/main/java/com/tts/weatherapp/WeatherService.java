package com.tts.weatherapp;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import org.springframework.beans.factory.annotation.Value;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

public Response getForecast (String zipCode) {
    String url = "https://api.openweathermap.org/data/2.5/weather?zip=" + 
    zipCode + "&units=imperial&appid=" + apiKey;
    RestTemplate restTemplate = new RestTemplate();
    try{
    return restTemplate.getForObject(url, Response.class);
    }
    catch (HttpClientErrorException ex) {
        Response response = new Response();
        response.setName("error");
        return response;
    }
}

}