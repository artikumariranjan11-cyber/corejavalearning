package shauryax.mud;

import java.util.Scanner;

public class MudTwoDoubleUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number =");
        double x = scanner.nextDouble();

        System.out.print("enter 2nd number =");
        double y = scanner.nextDouble();

        double z = x % y;

        System.out.println("mud of double number is " + z);
    }
}
