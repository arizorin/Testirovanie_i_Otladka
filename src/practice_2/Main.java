package practice_2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double c = calc.addition(12,3);
        try {
            System.out.println(calc.factorial(-5));
        } catch (FactorialException e) {
            e.printStackTrace();
        }
    }
}
