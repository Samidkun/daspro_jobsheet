import java.util.Scanner;
/**
 * selection309
 */
public class selection309 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        double operand1, operand2,  result;
        char operator;
        System.out.println("input operand 1: ");
        operand1 = input05.nextDouble();
        System.out.println("input operand 2: ");
        operand2 = input05.nextDouble();
        System.out.println("input operator (+ - * /): ");
        operator = input05.next().charAt(0);
        switch (operator){
            case '+':
            result = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + "=" + result);
            break;
            case '-':
            result = operand1 - operand2;
            System.out.println(operand1 + " - " + operand2 + "=" + result);
            break;
            case '*':
            result = operand1 * operand2;
            System.out.println(operand1 + " * " + operand2 + "=" + result);
            break;
            case '/':
            result = operand1 / operand2;
            System.out.println(operand1 + " / " + operand2 + "=" + result);
            break;

        }
        
    }
}