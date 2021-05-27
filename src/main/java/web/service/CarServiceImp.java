package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCars() {
        return this.cars;
    }

    @Override
    public List<Car> getCars(int count) {
        if (this.cars.size() < count) {
            return this.cars;
        }
        return cars.subList(0, count);
    }

    @Override
    public void addCar(String firm, String model, String color) {
        cars.add(new Car(firm, model, color));
    }
}
