import java.util.Scanner;

public class CalculatorApp {
    private static Scanner Calc = new Scanner(System.in);

    public static void main(String[] args) {
        double firstNum = 0;
        double secondNum = 0;
        System.out.println("Enter the first number: ");
        firstNum = Calc.nextDouble();
        System.out.println("Enter the second number:");
        secondNum = Calc.nextDouble();

        System.out.println("Select the order of operation: ");
        char operator = Calc.next().charAt(0);
        double c = 0;

        Calculator calculator = new Calculator(firstNum, secondNum);
        switch (operator) {
            case '+':
                c = calculator.add(firstNum, secondNum);
                System.out.println("Answer: " + c);
                break;

            case '-':
                c = calculator.sub(firstNum, secondNum);
                System.out.println("Answer: " + c);
                break;

            case '*':
                c = calculator.mul(firstNum, secondNum);
                System.out.println("Answer: " + c);
                break;

            case '/':
                c = calculator.div(firstNum, secondNum);
                System.out.println("Answer: " + c);
                break;
            default:
                System.out.println("Invalid operation code"); //Обработка исключения ввода неверного оператора
                break;
        }
    }

}