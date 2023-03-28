package ss10_list.bai_tap.array_list;
import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }


    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapa();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }
    boolean add(E e) {
        add(size, e);
        return true;
    }

    E remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E res = elements[index];
        if(size > 1){
            E[] tmp = (E[]) new Object[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (i != index) {
                    tmp[j++] = elements[i];
                }
            }
            elements = tmp;
            size--;
        }
        else{
            //qq cannot init arr with size 0
            clear();
        }
        return res;

    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    void clear() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    int size() {
        return size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //ktra xem trong list co chua e hay k
    boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
    int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }


}
//
//import org.omg.CORBA.Object;
//
//import java.util.Arrays;
//
//public class MyList<E> {
//    private static final int DEFAULT_CAPACITY = 10;
//    private E[] elements;
//    private int size = 0; //size xác định số phần tử trong danh sách, mặc định gán là 0.
//
//    public MyList() {
//        elements = (E[]) new Object[DEFAULT_CAPACITY];
//    }
//
//    // lưu số phần tử
//    public MyList(int capacity) {
//        elements = (E[]) new Object[capacity];
//    }
//
//    private void ensureCapa() {
//        elements = Arrays.copyOf(elements, elements.length * 2);
//    }
//
//
//    void add(int index, E element) {
//        if (index < 0 || index > size) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        ensureCapa();
//
//        for (int i = size; i > index; i--) {
//            elements[i] = elements[i - 1];
//        }
//
//        elements[index] = element;
//        size++;
//    }
//
//
//    E get(int index) {
//        if (index < 0 || index > size) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        return elements[index];
//    }
//
//    E remove(int index) {
//        if (index >= size) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        E res = elements[index];
//        if (size > 1) {
//            E[] tmp = (E[]) new java.lang.Object[size - 1];
//
//            for (int i = 0, j = 0; i < size; i++) {
//                if (i != index) {
//                    tmp[j++] = elements[i];
//                }
//            }
//
//            elements = tmp;
//            size--;
//        } else {
//            //qq cannot init arr with size 0
//            clear();
//        }
//        return res;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    void clear() {
//        size = 0;
//        elements = (E[]) new java.lang.Object[DEFAULT_CAPACITY];
//    }
//
//    @Override
//    protected java.lang.Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    // kiểm tra có phần tử trong mảng không
//    boolean contains(E e) {
//        for (int i = 0; i < size; i++) {
//            if (elements[i].equals(e)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//    // kiểm tra có phần tử trong mảng không và in ra vị trí phần tử đó trong mảng
//
//    int indexOf(E e) {
//        for (int i = 0; i < size; i++) {
//            if (elements[i].equals(e)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//
//}
