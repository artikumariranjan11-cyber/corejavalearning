package shauryax.addition;

public class AddFloatNumberTest {

    public static void main(String[] args){

        AddFloatNumber addFloatNumber = new AddFloatNumber();
        addFloatNumber.addition();
        Float sum = addFloatNumber.additionAndReturnValue();
        System.out.println("sum = " + sum);
        addFloatNumber.additionByParameter(667F, 6F);
        Float total = addFloatNumber.additionByParameterAndReturnValue(877F, 2F);
        System.out.println("total = " + total);
    }
}
