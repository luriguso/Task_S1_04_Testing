package level2.exercise4.classData;

import java.math.BigDecimal;

public abstract class Smartphone {
    private BigDecimal price;

    public Smartphone(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public abstract String getBrand();
    public abstract String getModel();
}
