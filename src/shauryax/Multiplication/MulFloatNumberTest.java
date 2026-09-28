package shauryax.Multiplication;

public class MulFloatNumberTest {

    public static void main(String[] args){

        MulFloatNumber mulFloatNumber = new MulFloatNumber();
        mulFloatNumber.multiplication();
        Float mul = mulFloatNumber.multiplicationAndReturnValue();
        System.out.println("mul = " + mul);
        mulFloatNumber.multiplicationByParameter(885F, 10F);
        Float total = mulFloatNumber.multiplicationByParameterAndReturnValue(822F, 883F);
        System.out.println("total = " + total);
    }
}
