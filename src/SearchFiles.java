import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;

public class SearchFiles {
    public static ArrayList SearchFiles(String path) {
        ArrayList<File> myList = new ArrayList<File>();
        File root = new File(path);
        ArrayList<File> expand = new ArrayList<File>();
        expand.add(root);

        return createList(myList, expand);
    }

    private static ArrayList<File> createList(ArrayList<File> myList, ArrayList<File> expand) {
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

        return createList(myList, expand);
    }
}

