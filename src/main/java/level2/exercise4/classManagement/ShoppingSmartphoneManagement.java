package level2.exercise4.classManagement;

import level2.exercise4.classData.Android;
import level2.exercise4.classData.Iphone;
import level2.exercise4.classData.ShoppingCar;
import level2.exercise4.classData.Smartphone;

import java.math.BigDecimal;

public class ShoppingSmartphoneManagement {
    private ShoppingCar shoppingCar;

    public ShoppingSmartphoneManagement() {
        this.shoppingCar = new ShoppingCar();
    }

    public void addSmartphoneInitial(){
        Android android = new Android(new BigDecimal("700"), "Samsung", "S22 Ultra");
        Android android1 = new Android(new BigDecimal("500"), "Xiaomi", "bla bla");
        Iphone iphone = new Iphone(new BigDecimal("700"), "14 Plus");

        shoppingCar.addSmartphone(iphone);
        shoppingCar.addSmartphone(android);
        shoppingCar.addSmartphone(android1);
    }

    public void listShoppingCar(){
        for(Smartphone smartphone:shoppingCar.getSmartphones()){
            System.out.println("Smartphone: " +
                    "Brand: " + smartphone.getBrand()
                 + "\nModel: " + smartphone.getModel()
                 + "\nPrice: " + smartphone.getPrice());
        }
    }
}
