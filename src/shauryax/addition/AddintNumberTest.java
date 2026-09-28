package shauryax.addition;

public class AddintNumberTest {

    public static void main(String[] args){
        AddintNumber addintNumber = new AddintNumber();
        addintNumber.addition();
        int sum = addintNumber.additionAndReturnValue();
        System.out.println("sum = " + sum);
        addintNumber.additionByParameter(12, 10);
        int total = addintNumber.additionByParameterAndReturnValue(122, 222);
        System.out.println("total = " + total);
    }
}

