package shauryax.Multiplication;

public class MulintNumberTest {

    public static void main(String[] args){
        MulintNumber mulintNumber = new MulintNumber();
        mulintNumber.multiplicaition();
        int mul = mulintNumber.multiplicationAndReturnValue();
        System.out.println("mul = " + mul);
        mulintNumber.multiplicationByParameter(98, 10);
        int total = mulintNumber.multiplicationByParameterAndReturnValue(666, 332);
        System.out.println("total = " + total);
    }
}
