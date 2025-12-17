//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int testInt = 5;

    //cant print testInt because its not static

    public static void main(String[] args) {
        int[] source = {1, 2, 3};
        int[] destination = source;
       destination [0]=100;
        System.out.println(source[0]);
//
//
//        //  System.out.println(testInt);
//        System.out.println(Math.PI);
//        Utils.printUtilsString(32);
//        System.out.println(Utils.DIAMETER_EARTH_KM);
//        System.out.println(Utils.DIAMETER_SUN_KM);
//        //final static
//
//        Pizza diavolo = new Pizza(10);
//        Pizza margerita = new Pizza(0);
//        System.out.println(margerita.getCookedPizzas());
//        System.out.println(margerita.getSalami());
//        System.out.println(diavolo.getCookedPizzas());
//        System.out.println(diavolo.getSalami());
//        System.out.println(Singelton.getInstance());
//
    }


}