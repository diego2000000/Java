public class Singelton {
    private static String instance;
    public static String getInstance(){
        if (instance==null){
            instance="test";
        }
        return instance;
    }
    private Singelton(){

    }

}
