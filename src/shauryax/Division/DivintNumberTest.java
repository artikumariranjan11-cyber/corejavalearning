package shauryax.Division;

public class DivintNumberTest {

    public static void main(String[] args){

        DivintNumber divintNumber = new DivintNumber();
        DivintNumber .division();
        int div = divintNumber.divisionAndReturnValue();
        System.out.println("div = " + div);
        divintNumber.divisionByParameter(88, 10);
        int total = divintNumber.divisionByParameterAndReturnValue(288, 62);
        System.out.println("total = " + total);
    }
}
