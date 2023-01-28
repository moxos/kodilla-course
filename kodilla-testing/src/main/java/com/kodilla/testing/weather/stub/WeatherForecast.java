package com.kodilla.testing.weather.stub;
import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double srednia() {
        double srednia = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            srednia += temperature.getValue();

        }
        return (srednia / temperatures.getTemperatures().size());

    }

    public double mediana() {
        double mediana = 0.0;
        List<Double> list = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            list.add(temperature.getValue());
        }

        int elements = list.size();
        System.out.println(list.size());
        Collections.sort(list);

        if (elements % 2 == 0) {
            int firstelement = (list.size() / 2) - 1;
            int secondelement = list.size() / 2;
            mediana = (list.get(firstelement) + list.get(secondelement)) / 2;
        } else {
            int element = (int) ((list.size() / 2) + 0.5);
            mediana = list.get(element);
            System.out.println(list);
        }

        return mediana;
    }
}




