import java.util.ArrayList;

public class SortParenthesis {
    public static void addParen(ArrayList<String> list, int leftRem, int rightRem, char[] str, int count) { // leftRem и rightRem - это количество скобок (открывающих и закрывающих, и там и там один аргумент)
        if (leftRem < 0 || rightRem < leftRem) return; // некорректное состояние

        if (leftRem == 0 && rightRem == 0) { // свободных скобок больше нет, строка сформирована
            String s = String.copyValueOf(str); // массив char передается в строку s для записи в список
            list.add(s); // добавление корректной строки в ячейку списка
        } else { // строка не сформирована до конца, еще есть незадействованные скобки
            if (leftRem > 0) { // еще есть открывающие скобки
                str[count] = '('; // по индексу записывается открывающая скобка
                addParen(list, leftRem - 1, rightRem, str, count + 1); // рекурсивно вызывается функция, при этом уменьшается переменная свободных открывающих скобок на 1 (мы тотлько что ее записали в массив)
            }

            if (rightRem > leftRem) { // условие проверяется, если открывающие скобки закончились. Идентичная проверка, но уже с правыми.
                str[count] = ')';
                addParen(list, leftRem, rightRem - 1, str, count + 1);
            }
        }
    }
    public static ArrayList<String> generateParens(int count) {
        char[] str = new char[count * 2]; // различные комбинации скобок, это сумма левых и правых, в любом случае, и уже впоследствии изменяемая комбинация. Поэтом внутри этого массива они поместятся
        ArrayList<String> list = new ArrayList<String>(); // пустой список для записи комбинаций
        addParen(list, count, count, str, 0); // вызов функции записи комбинаций
        return list; // итоговый список комбинаций
    }
}

