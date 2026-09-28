package shauryax.Multiplication;

public class MulLongNumberTest {

    public static void main(String[] args){

        MulLongNumber mulLongNumber = new MulLongNumber();
        mulLongNumber.multiplication();
        Long mul = mulLongNumber.multiplicationAndReturnValue();
        System.out.println("mul = " + mul);
        mulLongNumber.multiplicationByParameter(885L, 109L);
        Long total = mulLongNumber.multiplicationByParameterAndReturnValue(822L, 883L);
        System.out.println("total = " + total);
    }
}
