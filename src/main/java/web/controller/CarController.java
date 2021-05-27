package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    // HttpServletRequest - если не передавать параметры, возвращает null
    // @RequestParam - выдаст 404 ошибку, если не передавать параметры, необходимо писать required = false
    @GetMapping(value = "/cars")
    public String index (@RequestParam(value = "count", required = false) String count, ModelMap model) {
        CarService cars = new CarServiceImp();
        cars.addCar("BMW", "3", "black");
        cars.addCar("Audi", "6", "silver");
        cars.addCar("Mercedes", "e-class", "white");
        cars.addCar("VW", "passat", "black");
        cars.addCar("Nissan", "juke", "yellow");
        if (count == null) {
            model.addAttribute("cars", cars.getCars());
        } else {
            model.addAttribute("cars", cars.getCars(Integer.parseInt(count)));
        }
        return "cars";
    }
}
