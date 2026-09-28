package shauryax.Datacoversion;

public class IntPrimitiveAndIntegerWrapperClass {

    public static void main(String[] args) {
        Integer x = 10;
        System.out.println("value of int x = " + x);

        Integer y = 20;
        System.out.println("value of Integer y = " + y);
        y = x;
        System.out.println("value of x assign to y then y = " + y);

        x = y;
        System.out.println("value of  y assign to x then x = " + x);

        int maxValue = Integer.MAX_VALUE;

        int minValue = Integer.MAX_VALUE;

        System.out.println("max value of integer is "+ maxValue);
        System.out.println("min value of integer is "+ minValue);

        int maxData = Integer.max(5,6);
        System.out.println("max value in 5 and 6 is "+ maxData);

        int minData = Integer.max(5,6);
        System.out.println("max value in 5 and 6 is "+ minData);

        int sum = Integer.max(7,8);
        System.out.println("sum of 7 and 8 is "+ sum);

        //convert String to Integer
        String value = "5";
        int z = 10;

        //converting String value to Integer
        int value1 = Integer.parseInt(value);

        int add = z + value1;
        System.out.println("add value of 10 and 5 is "+ add);


    }
    }
