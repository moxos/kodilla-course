package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {

        // Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assertions.assertEquals(5, quantityOfSensors);
    }
    @BeforeEach
    public void before(){
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.0);
        temperaturesMap.put("Krakow", 10.0);
        temperaturesMap.put("Wroclaw", 25.0);
        temperaturesMap.put("Warszawa", 30.0);
        temperaturesMap.put("Gdansk", 30.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
    }
    @Test
    void testSrednia() {
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double quantityOfSensors = weatherForecast.srednia();
        Assertions.assertEquals(24, quantityOfSensors);

    }

    @Test
    void testMediana() {
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double quantityOfSensors = weatherForecast.mediana();
        Assertions.assertEquals(25, quantityOfSensors);
    }
}
