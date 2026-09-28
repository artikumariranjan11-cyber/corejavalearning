package shauryax.Add;
import java.util.Scanner;
public class SumIntegerNumberUserInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        Integer x = scanner.nextInt();

        System.out.print("Enter 2nd number = ");
        Integer y = scanner.nextInt();

        Integer sum = x + y;

        System.out.println("sum of user input is " +sum);

    }
}
