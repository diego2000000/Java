//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fillament pla = new Fillament("PLA", "white", 230);
        if (Fillament.temprange(pla.printTemp, pla.material) == 1) {
            pla.printTemp = 200;
            System.out.println("setting print temp to 200");
        }
        System.out.println(pla.printTemp);
    }
}