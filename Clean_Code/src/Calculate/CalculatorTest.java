package Calculate;

import java.util.Random;

public class CalculatorTest {
    // tach hang
    // Giá trị '+': ADDITION - toán tử cộng
    //Giá trị '-': SUBTRACTION - toán tử trừ
    //Giá trị '*': MULTIPLICATION - toán tử nhân
    //Giá trị '/': DIVISION - toán tử chia
    public static final char ADDITION = '+';
    public static final char SUBTRACTION  = '-';
    public static final char MULTIPLICATION  = '*';
    public static final char DIVISION  = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator ) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0){
                    return firstOperand / secondOperand;
                } else {
                    throw new RuntimeException("abc");
                }
            default:
                throw new RuntimeException("xyz");
        }
    }
}
