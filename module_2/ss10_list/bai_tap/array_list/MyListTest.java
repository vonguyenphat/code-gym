package ss10_list.bai_tap.array_list;

import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ar1 = new MyList<>();
        ar1.add(0,1);
        ar1.add(1);
        ar1.add(3);
        System.out.println(ar1.get(0));
    }
}
