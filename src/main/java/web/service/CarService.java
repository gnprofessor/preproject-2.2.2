package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
    List<Car> getCars();
    void addCar(String firm, String model, String color);
}
