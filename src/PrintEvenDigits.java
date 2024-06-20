import java.util.ArrayList;

public class PrintEvenDigits {
    public static ArrayList print (ArrayList<Integer> myList, int zero) {
        if (zero >= myList.size()) return myList;

        if (myList.get(zero) % 2 == 0) {
            System.out.println(myList.get(zero));
        }

        return print(myList, zero + 1);
    }
}

