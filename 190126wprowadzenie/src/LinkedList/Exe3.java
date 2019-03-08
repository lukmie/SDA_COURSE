package LinkedList;

import java.util.*;

public class Exe3 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Pink");
        list.add("White");
        list.add("Blue");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);

        Object o = list2.removeFirst();
        System.out.println(o);


//        Iterator i = list.listIterator();
//
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }


    }
}
