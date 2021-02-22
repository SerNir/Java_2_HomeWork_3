import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        Map<Integer, String> phonebook = new HashMap<>();
        add(phonebook, 523655, "Ivanov");
        add(phonebook, 656581, "Petrov");
        add(phonebook, 687615, "Sidorov");
        add(phonebook, 548465, "Malov");
        add(phonebook, 849556, "Sidorov");
        add(phonebook, 546575, "Sidorov");
        add(phonebook, 545752, "Ivanov");

        get(phonebook, "Ivanov");
        get(phonebook,"Petrov");
        get(phonebook, "Sidorov");
        get(phonebook, "Dukalis");
    }

    public static Map<Integer, String> add(Map<Integer, String> map, int phoneNumber, String name) {
        map.put(phoneNumber, name);
        return map;
    }

    public static void get(Map<Integer, String> map, String name) {
        int count = 0;
        System.out.println("По запросу " + name + " найдены следующие контакты: ");
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            int key = item.getKey();
            String value = item.getValue();
            if (name.equals(value)) {
                count++;
                System.out.println("Фамилия: " + value + " номер: " + key);
            }
        }
        if(count == 0){
            System.out.println("Контакты не найдены.");
        }

    }
}
