import java.util.ArrayList;
import java.io.File;
import java.util.List;

public class SearchFiles {
    public static List<File> SearchFiles(File root) {
        ArrayList<File> myList = new ArrayList<>();
        File[] expand = root.listFiles();

        for (File file : expand) {
            if (file.isDirectory()) {
                myList.addAll(SearchFiles(file));
            } else {
                myList.add(file);
            }
        }

        return myList;
    }
}
