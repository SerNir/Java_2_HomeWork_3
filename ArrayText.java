import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class ArrayText {
    public static int count;

    public static void main(String[] args) {

        searchUniqueWord(getTextArray());
        searchDuplicateWord(getTextArray());

    }

    public static void searchUniqueWord(ArrayList<String> arr) {
        int a = 0;
        System.out.println("Уникальные слова массива: ");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (arr.get(i).equals(arr.get(j))) {
                    a++;
                }
            }
            if (a == 0) {
                System.out.println(arr.get(i));
            }
            a = 0;
        }
    }

    public static void searchDuplicateWord(ArrayList<String> arr) {


        Map<String, Integer> map= new HashMap<>();
        System.out.println("Количество повторений слов в массиве:");
        for(String s : arr){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        map.entrySet().forEach(System.out::println);
    }


    private static ArrayList<String> getTextArray() {
        ArrayList<String> array = new ArrayList<>();
        array.add("восход");
        array.add("запад");
        array.add("перепелка");
        array.add("столб");
        array.add("ребенок");
        array.add("столб");
        array.add("переход");
        array.add("строка");
        array.add("программа");
        array.add("система");
        array.add("алфавит");
        array.add("табуретка");
        array.add("запад");
        array.add("сибирь");
        array.add("столб");
        array.add("поток");
        array.add("наследование");
        array.add("программа");
        array.add("система");
        array.add("столб");
        return array;
    }
}
