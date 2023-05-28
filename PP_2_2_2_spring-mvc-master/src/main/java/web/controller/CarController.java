package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping("/cars")
    public String showAllCars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 3, "Black"));
        cars.add(new Car("Audi", 5, "White"));
        cars.add(new Car("Peugeot", 306, "Red"));
        cars.add(new Car("Mercedes", 232, "Grey"));
        cars.add(new Car("ЛАДА", 666, "Зеленый"));

        cars = CarService.carsCount(cars, allCars);
        model.addAttribute("cars", cars);

        return "cars";
    }
}
