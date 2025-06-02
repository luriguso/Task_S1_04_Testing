package level2.exercise4.classData;

import java.math.BigDecimal;

public class Android extends Smartphone {
    private String brand;
    private String model;

    public Android(BigDecimal price, String brand, String model) {
        super(price);
        this.brand = brand;
        this.model = model;
    }
    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public String getModel() {
        return model;
    }
}
