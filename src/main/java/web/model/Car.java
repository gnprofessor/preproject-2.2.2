package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String firm;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String firm, String model, String color) {
        this.firm = firm;
        this.model = model;
        this.color = color;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
