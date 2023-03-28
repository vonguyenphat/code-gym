package ss14_sort.minh_hoa_tt_sort_chen;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Your input list: ");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        insertionSort(list);

    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }
    public static void println(int[] a) {
        for (int j : a) {
            System.out.printf("%4d", j);
        }
        System.out.println();
    }
}



