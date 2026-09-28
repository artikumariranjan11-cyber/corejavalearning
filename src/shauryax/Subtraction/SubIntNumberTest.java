package shauryax.Subtraction;

public class SubIntNumberTest {

    public static void main(String[] args){

        SubIntNumber subintNumber = new SubIntNumber();
        subintNumber.subtraction();
        int sub = subintNumber.subtractionAndReturnValue();
        System.out.println("sub = " + sub);
        subintNumber.subtractionByParameter(88, 10);
        int total = subintNumber.subtractionByParameterAndReturnValue(992, 982);
        System.out.println("total = " + total);
    }
}
