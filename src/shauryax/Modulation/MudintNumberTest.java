package shauryax.Modulation;

public class MudintNumberTest {

    public static void main(String[] args) {

        MudintNumber MudintNumber = new MudintNumber();
        MudintNumber.MudintNumber();
        int mud = MudintNumber.modulationAndReturnValue();
        System.out.println("mud = " + mud);
        MudintNumber.ModulationByParameter(889, 2);
        int total = MudintNumber.modulationByParameterAndReturnValue(6660, 3);
        System.out.println("total = " + total);
    }
}
