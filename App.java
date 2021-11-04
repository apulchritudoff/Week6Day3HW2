public class App {
    public static void main(String[] args) throws Exception {
        
        // Creates a new instance of Calculator
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(3, 1));
        System.out.println(calculator.multiply(2, 3));
        System.out.println(calculator.divide(6, 2));
        System.out.println(calculator.square(8));

        // Creates a new instance of MagicCalculator
        MagicCalculator magicCalculator = new MagicCalculator();
        System.out.println(magicCalculator.findSquareRoot(9));
        System.out.println(magicCalculator.findFactorial(5));
        System.out.println(magicCalculator.findSin(1));
        System.out.println(magicCalculator.findCos(0));
        System.out.println(magicCalculator.findTan(1));

    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }


}

// Class MagicCalculator that inherits its basic functionality from class Calculator

class MagicCalculator extends Calculator {

    public double findSquareRoot(int a) {
        return Math.sqrt(a);
    }

    public int findFactorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public double findSin(int a) {
        return Math.sin(a);
    }

    public double findCos(int a) {
        return Math.cos(a);
    }

    public double findTan(int a) {
        return Math.tan(a);
    }
}