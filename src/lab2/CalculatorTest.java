package lab2;

import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addition() {
        Calculator calculator = new Calculator();
        double sum = calculator.addition(0.0000001, 0.00000007);
        assertThat(sum, equalTo(0.00000017));
        /* Множество чисел типа Double в java не являются точными в связи с их методологией хранения в языке так как Java может хранить только целочисленные обьекты.
           Пример: 1/4 = 2^(-2), а 1/3 = 2^(-2) + 2^(-3)+ 2^(-4) +2^(-5) и тд.
           Один из вариантов решения - использования BigDecimal
        */
    }

    @Test
    public void subtraction() {
    }

    @Test
    public void multiply() {
        Calculator calculator = new Calculator();
        assertThat("Проверка умножения на ноль",calculator.multiply(20,0), equalTo(0.0));
    }

    @Test
    public void division(){
        Calculator calculator = new Calculator();
        assertThat("Проверка деления на ноль",calculator.division(20,0), equalTo(Infinity));
    }

    @Test
    public void factorial() throws FactorialException {
        Calculator calculator = new Calculator();
        assertThat("Проверка вычисления факториала",calculator.factorial(20), equalTo(2.432902e+18));
        /*
            Так как используется тип данных Int с лимитом по значению (2,147,483,647), то после его достижения функция вычиления факториала идет в обратную сторону
            Один из вариантов решения  - использования Long
         */
    }
}