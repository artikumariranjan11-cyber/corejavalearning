package shauryax.mud;

import java.util.Scanner;

public class MudIntegerNumberUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        Integer x = scanner.nextInt();

        System.out.print("Enter 2nd number = ");
        Integer y = scanner.nextInt();

        Integer mud = x % y;

        System.out.println("mud of user input is " +mud);

    }
}
