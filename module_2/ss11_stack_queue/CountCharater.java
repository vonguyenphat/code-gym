package ss11_stack_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharater {
    public static void main(String[] args) {
        String st = "vo nguyen phat";
        Map<Character, Integer> map = count(st);
        Set<Character> keys = map.keySet();
        for (Character c : keys) {
            System.out.println(c + ": " + map.get(c) + " lan");
        }

    }

    public static Map<Character, Integer> count(String st) {
        Map<Character, Integer> map = new HashMap<>();
        st = st.toLowerCase();
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        return map;
    }
}

