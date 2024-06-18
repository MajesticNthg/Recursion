import java.util.ArrayList;
public class Delete {
    public static int delete (ArrayList<Integer> myList) {
        if (myList.size() == 0) return 0;
        myList.remove(0);

        return 1 + delete(myList);
    }
}
