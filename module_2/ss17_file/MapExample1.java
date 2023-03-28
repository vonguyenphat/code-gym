package ss17_file;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample1 {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new TreeMap<>();
        map.put(100, "A");
        map.put(102, "C");
        map.put(101, "B");

        // show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
