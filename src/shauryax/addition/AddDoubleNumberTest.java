package shauryax.addition;

public class AddDoubleNumberTest {

    public static void main(String[] args){

        AddDoubleNumber addDoubleNumber = new AddDoubleNumber();
        addDoubleNumber.addition();
        Double sum = addDoubleNumber.additionAndReturnValue();
        System.out.println("sum = " + sum);
        addDoubleNumber.additionByParameter(667d, 6d);
        Double total = addDoubleNumber.additionByParameterAndReturnValue(877d, 2d);
        System.out.println("total = " + total);
    }
}
