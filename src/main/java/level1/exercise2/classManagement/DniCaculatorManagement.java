package level1.exercise2.classManagement;

import level1.exercise2.classData.DniCalculator;

import java.util.ArrayList;
import java.util.List;

public class DniCaculatorManagement {
    List<DniCalculator> dniCalculators = new ArrayList<>();

    public DniCaculatorManagement() {
        this.dniCalculators = new ArrayList<>();

        addDniInitial();
    }

    public void addDniInitial(){
        DniCalculator dni = new DniCalculator(12345678);
        DniCalculator dni2 = new DniCalculator(12345478);
        DniCalculator dni3 = new DniCalculator(12335678);
        DniCalculator dni4 = new DniCalculator(12346678);

        dniCalculators.add(dni);
        dniCalculators.add(dni2);
        dniCalculators.add(dni3);
        dniCalculators.add(dni4);
    }

    public void calculateDniLetter(){
        for(DniCalculator dniCalculator : dniCalculators){
            System.out.println("The letter that corresponds to " + dniCalculator.getNumberDni() + " is:" + dniCalculator.calculateLetter());
        }
    }
}
