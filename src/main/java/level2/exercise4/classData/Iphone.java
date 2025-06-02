package level2.exercise4.classData;

import java.math.BigDecimal;

public class Iphone extends Smartphone {
    private final String BRAND = "Iphone";
    private String model;

    public Iphone(BigDecimal price, String model) {
        super(price);
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
    @Override
    public String getBrand() {
        return BRAND;
    }
}
