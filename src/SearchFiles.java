import java.util.ArrayList;
import java.io.File;
import java.util.Arrays;

public class SearchFiles {
    public static ArrayList createList() {
        ArrayList<File> myList = new ArrayList<File>(); // пустой список, в котором будут файлы
        File root = new File("."); // директория каталога
        ArrayList<File> expand = new ArrayList<File>(); // список каталога
        expand.add(root); // заполняю список каталога

        return SearchFiles(myList, expand);
    }

    public static ArrayList<File> SearchFiles(ArrayList<File> myList, ArrayList<File> expand) {
        if (expand.isEmpty()) return myList; // файлов нет, каталогов нет

        File[] expandCopy = expand.toArray(new File[expand.size()]); // копия списка каталога
        expand.clear(); // обнуляю список каталога

        for (File file : expandCopy) { // цикл по каталогу
            if (file.isDirectory()) { // если файл директория, то погружаюсь в директорию
                expand.addAll(Arrays.asList(file.listFiles())); // перезаписываю список каталога подкаталогом
            } else {
                myList.add(file); // добавляю файл в список
            }
        }

        return SearchFiles(myList, expand); // возвращаю заполненный список с файлами
    }
}

