import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;

public class SearchFiles {
    public static ArrayList createList() {
        ArrayList<File> myList = new ArrayList<File>();
        File root = new File(".");
        ArrayList<File> expand = new ArrayList<File>();
        expand.add(root);

        return SearchFiles(myList, root, expand);
    }

    public static ArrayList SearchFiles(ArrayList<File> myList, File root, ArrayList<File> expand) {
        if (expand.size() == 0) return myList;
        File[] expandCopy = expand.toArray(new File[expand.size()]);
        expand.clear();
        for (File file : expandCopy) {
            if (file.isDirectory()) {
                expand.addAll(Arrays.asList(file.listFiles()));
            } else {
                myList.add(file);
            }
        }
        SearchFiles(myList, root, expand);
        return myList;

    }

    public static void main(String[] args) {
        System.out.println(createList());
    }

}