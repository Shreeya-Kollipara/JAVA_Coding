class Calculator {
    int add(int a,int b) {
        return a+b;
    }

    double add(double a,double b) {
        return a+b;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a,int b) {
        return a+b+10;
    }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        Calculator calculator=new AdvancedCalculator();

        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(2.5,3.5));
    }
}
