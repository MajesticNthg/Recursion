import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;

public class SearchFiles {

    public static ArrayList<File> myList = new ArrayList<File>();
    public static ArrayList<File> expand = new ArrayList<File>();

    public static ArrayList<File> SearchFiles(String path) {
        File root = new File(path);

        if (myList.isEmpty() && expand.isEmpty()) {
            expand.add(root);
        }

        if (expand.isEmpty()) return myList;

        File[] expandCopy = expand.toArray(new File[expand.size()]);
        expand.clear();

        for (File file : expandCopy) {
            if (file.isDirectory()) {
                expand.addAll(Arrays.asList(file.listFiles()));
            } else {
                myList.add(file);
            }
        }

        return SearchFiles(path);
    }
}
