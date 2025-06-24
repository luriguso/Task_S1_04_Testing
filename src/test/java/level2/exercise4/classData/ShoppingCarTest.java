package level2.exercise4.classData;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class ShoppingCarTest {
    private  ShoppingCar shoppingCar;
    @BeforeEach
    void setUp() {
        shoppingCar = new ShoppingCar();
        Android  android = new Android(new BigDecimal("1100"), "Samsung", "S22 Ultra");
        Android android1 = new Android(new BigDecimal("1100"), "Huawei", "P30");
        Iphone iphone = new Iphone(new BigDecimal("1200"), "14 Pro Max");
        Iphone iphone1 = new Iphone(new BigDecimal("1200"), "14 Plus");

        shoppingCar.addSmartphone(android);
        shoppingCar.addSmartphone(android1);
        shoppingCar.addSmartphone(iphone);
        shoppingCar.addSmartphone(iphone1);
    }

    @Test
    void shouldMaintainInsertionOrderOfSmartphones(){
        Assertions.assertThat(shoppingCar.getSmartphones()).extracting(Smartphone::getModel).withFailMessage("does not maintain insertion order").containsExactly("S22 Ultra", "P30", "14 Pro Max", "14 Plus");
    }

    @Test
    void shouldContainAllInsertedSmartphonesInAnyOrder(){
        Assertions.assertThat(shoppingCar.getSmartphones()).extracting(Smartphone::getModel).withFailMessage("does not contain the inserted objects").containsExactlyInAnyOrder("S22 Ultra", "14 Plus", "P30", "14 Pro Max");
    }

    @Test
    void shouldContainSmartphoneOnlyOnce(){
        Assertions.assertThat(shoppingCar.getSmartphones()).extracting(Smartphone::getModel).withFailMessage("Contain more to one").containsOnlyOnce("14 Plus");
    }

    @Test
    void shouldNotContainNonInsertedSmartphone(){
        Assertions.assertThat(shoppingCar.getSmartphones()).extracting(Smartphone::getModel).withFailMessage("The smartphone exists").doesNotContain("15 Pro Max");
    }
}