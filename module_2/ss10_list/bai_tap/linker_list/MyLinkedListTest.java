package ss10_list.bai_tap.linker_list;

import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> ll = new MyLinkedList();
        ll.addFirst(17);
        ll.addLast(5);
        System.out.println(ll.get(0));


    }
}
