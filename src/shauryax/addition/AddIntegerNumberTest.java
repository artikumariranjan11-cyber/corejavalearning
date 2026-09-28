package shauryax.addition;

public class AddIntegerNumberTest {


    public static void main(String[] args){

        AddIntegerNumber addIntegerNumber = new AddIntegerNumber();
        addIntegerNumber.addition();
        Integer sum = addIntegerNumber.additionAndReturnValue();
        System.out.println("sum = " + sum);
        addIntegerNumber.additionByParameter(66, 10);
        Integer total = addIntegerNumber.additionByParameterAndReturnValue(122, 222);
        System.out.println("total = " + total);
    }
}
