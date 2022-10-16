public class Calculate {

    public int num1;
    public int num2;
    public String operation;

    public Calculate(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    // Calculation
    public String add() {
        return num1 + " + " + num2 + " = " +  (num1 + num2);
    }

    public String subtract() {
        return num1 + " - " + num2 + " = " +  (num1 - num2);
    }

    public String multiply() {
        return num1 + " * " + num2 + " = " +  (num1 * num2);
    }

    public String divide() {
        return num1 + " / " + num2 + " = " +  (num1 / num2);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
