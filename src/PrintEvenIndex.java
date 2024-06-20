import java.util.ArrayList;

public class PrintEvenIndex {
    public static ArrayList print(ArrayList myList, int zero) {
        if (zero > myList.size()) return myList;
        System.out.println(myList.get(zero));

        return print(myList, zero + 2);
    }
}

