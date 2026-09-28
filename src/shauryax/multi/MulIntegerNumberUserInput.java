package shauryax.multi;

import java.util.Scanner;

public class MulIntegerNumberUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        Integer x = scanner.nextInt();

        System.out.print("Enter 2nd number = ");
        Integer y = scanner.nextInt();

        Integer mul = x * y;

        System.out.println("sub of user input is " +mul);

    }
}
