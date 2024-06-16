import java.util.ArrayList;
public class Delete {
    public static int delete (ArrayList<Integer> myList, int size) {
        if (size <= 0) {
            myList.remove(0);
            return myList.size();
        }

        return delete(myList, size - 1);
    }
}