public class NamesArray {
    private String[] names = new String[10];

    void setNames() {

        names[0] = "Primis";
        names[1] = "Diego";
        names[2] = "Herbi";
        names[3] = "Gregi";
        names[4] = "Elia";
        names[5] = "Cedi";
        names[6] = "Kate";
        names[7] = "John";
        names[8] = "Jack";
        names[9] = "Elsa";
    }

    void firstPartOfExercise() {

        NamesArray test = new NamesArray();
        System.out.println(test.names[5]);
        System.out.println(test.names[1]);
        System.out.println(test.names[0]);
        System.out.println(test.names.length);

//        for (String valueNames:test.names){
//            System.out.println(valueNames);
//        }
    }

    void printValueATIndex5() {

        NamesArray valueAT5 = new NamesArray();
        System.out.println(valueAT5.names[5]);
    }

    void printMyName() {

        NamesArray printMyName = new NamesArray();
        System.out.println(printMyName.names[1]);
    }

    void printArrayLength() {

        System.out.println(names.length);
    }

    void loopThroughArray() {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    void foreachLoopThroughArray() {

        for (String valueOfNames : names) {
            System.out.println(valueOfNames);
        }
    }

    void printArraysValuesFromTo(int startPos, int endPos) {

        if (startPos < endPos) {

            for (int i = startPos; i <= endPos; i++) {
                System.out.println(names[i]);
            }
        } else if (startPos > endPos) {
            for (int i = startPos; i < names.length; i++) {
                System.out.println(names[i]);
            }
            for (int i1 = 0; i1 <= endPos; i1++) {
                System.out.println(names[i1]);
            }
        } else {
            System.out.println("Starting and End position cant be the same");
        }
    }

    NamesArray() {
        setNames();
        names[0] = "Primus";
    }
}
