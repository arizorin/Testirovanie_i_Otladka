package lab2;

public class Calculator{
    public double addition(double a, double b){
        return  a+b;
    }
    public double subtraction(double a, double b){
        return  a-b;
    }
    public double multiply(double a, double b){
        return  a*b;
    }
    public double division(double a, double b){
            return  a/b;
    }
    public double factorial(int a) throws FactorialException{
        int sum = 0;
        if(a < 1){
            throw new FactorialException("Ошибка вычисления фаткориала.\nЧисло меньше > 1.");
    }
        else {
            for (int i = 0; i < a; i++) {
                sum = (a-1)*a;
            }
            return sum;
        }
    }
}
