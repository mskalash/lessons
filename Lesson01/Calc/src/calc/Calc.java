package calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        char operation;
        int  answer;

        Scanner in = new Scanner(System.in);

        System.out.println("First number:");
        int first = in.nextInt();

        System.out.println("The second number:");
        int second = in.nextInt();

        System.out.println("Select operation");
        operation = in.next().charAt(0);
        switch (operation){
            case '+':
                answer = first + second;
                System.out.println("sum =  " + answer);
                break;
            case '-':
                answer = first - second;
                System.out.println("dif =  " + answer);
                break;
            case '*':
                if (second != 0 && first != 0) {
                    answer = first * second;
                    System.out.println("mul = " + answer);
                }
                else {
                    System.out.println("multiplying by zero returns zero");
                }
                break;
            case  '/':
                if (second != 0) {
                    answer = first / second;
                    System.out.println("div" + answer);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("*******");
                break;
        }



    }
}
