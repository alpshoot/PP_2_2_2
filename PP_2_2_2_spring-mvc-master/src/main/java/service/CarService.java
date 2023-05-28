package service;


import model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> carsCount(List<Car> cars, int count) {
        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
