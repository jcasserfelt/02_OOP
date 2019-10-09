package Sprint2.ScannersMM.Felhantering;

public class Kalkylator {


    boolean correctOperator(String operator) {
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            return true;
        } else return false;
    }


    boolean correctOperator(char operator) {
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            return true;
        } else return false;
    }

    double calc2(double a, char ope, double b) throws OperatorNotSupportedException {
        if (correctOperator(ope)) {
            throw new OperatorNotSupportedException("Felaktig operator");
        }
        double result = 0;

        if (ope == '+') {
            result = a + b;
        } else if (ope == '-') {
            result = a - b;
        } else if (ope == '*') {
            result = a * b;
        } else if (ope == '/') {
            result = a / b;
        }
        return result;
    }


    public static double calc(double a, char ope, double b) {
        double result = 0;
        if (ope == '+') {
            result = a + b;
        } else if (ope == '-') {
            result = a - b;
        } else if (ope == '*') {
            result = a * b;
        } else if (ope == '/') {
            result = a / b;
        }
        return result;
    }


}
