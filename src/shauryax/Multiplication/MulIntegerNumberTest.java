package shauryax.Multiplication;

public class MulIntegerNumberTest {

    public static void main(String[] args){
        MulIntegerNumber mulIntegerNumber = new MulIntegerNumber();
        mulIntegerNumber.multiplication();
        Integer mul = mulIntegerNumber.multiplicationAndReturnValue();
        System.out.println("mul = " + mul);
        mulIntegerNumber.multiplicationByParameter(77, 10);
        Integer total = mulIntegerNumber.multiplicationByParameterAndReturnValue(22, 3);
        System.out.println("total = " + total);
    }
}
