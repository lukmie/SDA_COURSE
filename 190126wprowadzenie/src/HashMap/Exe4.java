package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exe4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Poland", "Warsaw");
        map.put("Russia", "Moscow");

        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");


//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " : " + value);
//        }
//        System.out.println(map.size());
//
//        for (String key : map.keySet()) {
//            String value = map.get(key);
//            System.out.println(key);
//        }
//
//
//        for (String at : map.values()) {
//            System.out.println(at);
//        }

    }
}
