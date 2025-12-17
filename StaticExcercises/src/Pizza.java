public class Pizza {

    private int salami;
    private static int count = 0;

    public int getCookedPizzas(){
        return count;
    }
    public Pizza(int salami){
        this.salami=salami;
        count++;
    }
    public int getSalami(){
        return salami;
    }
}
