package shauryax.Multiplication;

public class MulDobuleNumberTest {

    public static void main(String[] args){

        MulDoubleNumber mulDoubleNumber = new MulDoubleNumber();
        mulDoubleNumber.multiplicaition();
        Double mul = mulDoubleNumber.multiplicationAndReturnValue();
        System.out.println("mul = " + mul);
        mulDoubleNumber.multiplicationByParameter(986D, 510D);
        Double total = mulDoubleNumber.multiplicationByParameterAndReturnValue(666D, 332D);
        System.out.println("total = " + total);
    }
}
