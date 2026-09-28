package shauryax.Subtraction;

public class SubIntegerNumberTest {

    public static SubIntegerNumber SubIntegerNumber;

    public static void main(String[] args){

        SubIntegerNumber subIntegerNumber = new SubIntegerNumber();
        SubIntegerNumber.SubIntegerNumber();
        Integer sub = SubIntegerNumber.subtractionAndReturnValue();
        System.out.println("sub = " + sub);
        SubIntegerNumber
                .subtractionByParameter(666, 12);
        Integer total = SubIntegerNumber.subtractionByParameterAndReturnValue(765, 232);
        System.out.println("total = " + total);
    }
}
