package level1.exercise2.classData;

import java.util.ArrayList;
import java.util.Arrays;

public class DniCalculator {
    private int numberDni;

    public DniCalculator(int numberDni) {
        if(!verifyNumberDni(numberDni)){
            System.out.println("Invalid Dni");
            return;
        }
        this.numberDni = numberDni;
    }

    public int getNumberDni() {
        return numberDni;
    }

    public String calculateLetter(){
        ArrayList<String> letters = new ArrayList<>(Arrays.asList("T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"));
        int rest = numberDni % 23;
        return letters.get(rest);
    }

    public boolean verifyNumberDni(int numberDni){
        boolean result = false;
        if(String.valueOf(numberDni).length() == 8){
            result = true;
        }
        return result;
    }
}
