package service;

public class CalculatorService {

    public double add(double a , double b){
        return a +b;
    }
    public double subtract(double a, double b){
        return a -b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public  double divide(double a, double b) {
        if (b == 0){
            throw new ArithmeticException("Cannot divide by Zero");
    }
        return a/b;
    }
    public double sqrt(double a){
        if(a < 0){
            throw new ArithmeticException("Cannot Calcolate sqaure root of a -ve number!");
        }
        return Math.sqrt(a);
    }

    public double log10(double a){
        if(a < 0){
            throw new ArithmeticException("Logarithm is Only defined for +ve number");
        }
        return Math.log10(a);
    }
    public double sin(double degree){
        return Math.sin(Math.toRadians(degree));
    }
    public double cos(double degree){
        return Math.cos(Math.toRadians(degree));
    }
    public double tan(double degree){
        return Math.tan(Math.toRadians(degree));
    }
    public double cosh(double degree){
        return Math.cosh(Math.toRadians(degree));
    }
    public double power(double base, double exponent){
        return Math.pow(base, exponent);
    }
    public double factorial(int n){
        if(n < 0 )
            throw new ArithmeticException("Factorial is not defined for -ve number!");
        double result = 1;
        for(int i = 1; i <= n; i++){
           result*=i;
        }
    return result;
    }
}
