package shauryax.Add;

import java.util.Scanner;

public class AddTwoLongUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number = ");
        long x = scanner.nextLong();

        System.out.print("enter 2nd number = ");
        long y = scanner.nextLong();

        long z = x + y;

        System.out.println("Sum of long numbers = " + z);

    }
    }
