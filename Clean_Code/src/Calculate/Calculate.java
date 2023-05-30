package Calculate;

public class Calculate {
    public static int calculate (int firstOperand,int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;

            case '*':
                return firstOperand * secondOperand;

            case '/':
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                }else {
                    throw new RuntimeException("abc");
                }
            default:
                throw new RuntimeException("xyz");
        }
    }
}
