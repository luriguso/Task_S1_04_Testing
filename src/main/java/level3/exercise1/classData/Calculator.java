package level3.exercise1.classData;

public class Calculator {
    public double sum(int a, int b){
        return a+b;
    }

    public double subtraction(int a, int b){
        return a-b;
    }

    public double multiplication(int a, int b){
        return a*b;
    }
    public double division(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a/b;
    }
}
