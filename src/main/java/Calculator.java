public class Calculator {
    double firstNum;
    double secondNum;

    Calculator(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    double sub(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    double mul(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    double div(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }
}
