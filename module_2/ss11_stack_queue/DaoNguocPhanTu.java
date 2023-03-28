package ss11_stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] a = new Integer[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        a[3] = 7;
        System.out.println("Mảng ban đầu:");
        Arrays.asList(a).forEach(System.out::println);

        Stack<Integer> stack = new Stack<>();

        //  Arrays.asList(a).forEach(m -> stack.push(m));
        for (Integer m : a) {
            stack.push(m);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            a[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo:");
        //  Arrays.asList(a).forEach(System.out::println);
        for (Integer printf : a) {
            System.out.println(printf);
        }
        System.out.println("---------------------");
        String b = sc.nextLine();
        System.out.println("Chuỗi ban đầu:");
        System.out.println(b);
        Stack<String> wString = new Stack<>();
        //  Arrays.asList(b.split("")).forEach(mString->wString.push(mString));
        for (int i = 0; i < b.length(); i++) {
            wString.push(b.charAt(i) + "");
        }
//        StringBuilder strReseve= new StringBuilder();
//        int sizeString = wString.size();
//        for (int i = 0; i < sizeString; i++) {
//            strReseve.append(wString.pop());
//        }
        System.out.println("Sau khi đảo chuỗi");

        for (int i = 0; i < b.length(); i++) {
            System.out.print(wString.pop());
        }

    }
}

