public class Fillament {
    public String material = "PLA";
    public String color = "black";
    public int printTemp = 175;

    public static int temprange(int temp, String material) {
        int settter = 0;
        if (material.equalsIgnoreCase("PLA")) {
            if (temp > 220) {
                System.out.println("your print temp is to high");
                settter = 1;
            } else if (temp < 175) {
                System.out.println("your print temp is to low");
                settter = 1;
            } else {
                System.out.println("print temp  in range");
            }
        }
        return settter;
    }

    public Fillament(String material, String color, int printTemp) {
        this.material = material;
        this.color = color;
        this.printTemp = printTemp;
    }


}
