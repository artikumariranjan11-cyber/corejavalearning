package shauryax.div;

import java.util.Scanner;

public class DivIntegerNumberUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        Integer x = scanner.nextInt();

        System.out.print("Enter 2nd number = ");
        Integer y = scanner.nextInt();

        Integer div = x / y;

        System.out.println("div of user input is " +div);

    }
}
