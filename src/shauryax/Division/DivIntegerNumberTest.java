package shauryax.Division;

public class DivIntegerNumberTest {
    public static void main(String[] args) {

        DivIntegerNumber DivIntegerNumber = new DivIntegerNumber();
        DivIntegerNumber.division();
        Integer div = DivIntegerNumber.divisionAndReturnValue();
        System.out.println("div = " + div);
        DivIntegerNumber.divisionByParameter(600, 2);
        Integer total = DivIntegerNumber.divisionByParameterAndReturnValue(98, 2);
        System.out.println("total = " + total);
    }

}
