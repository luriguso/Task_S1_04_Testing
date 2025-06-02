package level1.exercise3.classManagement;

public class CarManagement {
    String[] model;

    public CarManagement() {
        this.model = new String[]{"Camaro", "Rav4", "Challenger", "Mustang"};
    }

    public String triggerOutOfBounds(){
        return model[5];
    }
}
