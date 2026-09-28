package shauryax.mud;

import java.util.Scanner;

public class MudTwoIntUserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // user input 1st value
        System.out.print("enter 1st number = ");
        //int x = 80;
        int x = scanner.nextInt();

        System.out.print("enter 2nd number = ");
        //int y = 50;
        int y = scanner.nextInt();

        int z = x % y;

        System.out.println("mud = "+ z);
    }

}
