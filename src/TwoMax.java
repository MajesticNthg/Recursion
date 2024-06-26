import java.util.ArrayList;

public class TwoMax {
    public static int enterMax(ArrayList<Integer> myList) {
        secondMax(myList);

        return myList.get(1);
    }

    private static void secondMax(ArrayList<Integer> myList) {
        boolean sort = true;

        for (int i = 0; i < myList.size() - 1; i++) {
            if (myList.get(i + 1) > myList.get(i)) {
                myList.add(i, myList.get(i + 1));
                myList.remove(i + 2);
                sort = false;
            }
            if (i == myList.size() - 2 && sort == true) return;
        }

        secondMax(myList);
    }
}

