import java.util.ArrayList;

public class TwoMax {
    public static int enterMax (ArrayList <Integer> myList) {
        int max1 = 0;
        int max2 = 0;
        int amt = 0;
        max2 = secondMax(myList, max1, max2, 0);
        return max2;
    }
    public static int secondMax (ArrayList<Integer> myList, int max1, int max2, int amt) {
        if (amt >= myList.size()) return max2;
        if (myList.get(amt) >= max1) {
            max2 = max1;
            max1 = myList.get(amt);
        }
        if (myList.get(amt) >= max2 && myList.get(amt) < max1) {
            max2 = myList.get(amt);
        }

       return secondMax(myList, max1, max2, amt + 1);

    }
}

