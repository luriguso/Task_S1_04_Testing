package level2.exercise4.classData;

import java.util.ArrayList;

public class ShoppingCar {
    ArrayList<Smartphone> smartphones;
    public ShoppingCar() {
        this.smartphones = new  ArrayList<>();
    }

    public void addSmartphone(Smartphone smartphone) {
        this.smartphones.add(smartphone);
    }

    public ArrayList<Smartphone> getSmartphones() {
        return smartphones;
    }

}
