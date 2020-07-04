package task08.task0802;

/*
* Создать коллекцию Map<String, String> (реализация HashMap)
* Занести 10 пар строк
* Вывести на экран
*/

import java.util.HashMap;
import java.util.Map;

public class MapPairs {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("вишня","ягода");
        map.put("груша","фрукт");
        map.put("ежевика","куст");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
