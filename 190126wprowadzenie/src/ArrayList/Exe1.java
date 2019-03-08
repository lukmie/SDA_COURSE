package ArrayList;

import java.util.*;
import java.util.stream.Stream;

public class Exe1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");

        for (String c : list) {
            System.out.println(c);
        }
        System.out.println("***********");

        list.set(0, "pink");

        for (String c : list) {
            System.out.println(c);
        }
        System.out.println("***********");

//        list.remove(1);
//
//        for (String c : list) {
//            System.out.println(c);
//        }
//        System.out.println("***********");

        System.out.println(list.contains("red"));
        System.out.println("***********");


        Collections.sort(list);

        for (String c : list) {
            System.out.println(c);
        }
        System.out.println("***********");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        Collections.copy(list, list2);

        for (String c : list2) {
            System.out.println(c);
        }
        System.out.println("***********");

        Collections.shuffle(list2);
        for (String c : list2) {
            System.out.println(c);
        }
        System.out.println("***********");

        List<String> list3 = list2.subList(0,1);
        for (String c : list3) {
            System.out.println(c);
        }
        System.out.println("***********");

        List<String> sheet1 = new ArrayList<>();
        sheet1.add("honda");
        sheet1.add("hyundai");
        sheet1.add("ford");
        sheet1.add("fiat");

        List<String> sheet2 = new ArrayList<>();
        sheet2.add("honda");
        sheet2.add("hyundai");
//        sheet2.add("ford");
        sheet2.add("fiat");

        List<String> sheet3 = new ArrayList<>();
        for (String o : sheet1) {
            sheet3.add(sheet2.contains(o) ? "Yes" : "No");
        }
        System.out.println(sheet3);

        List<String> art = new ArrayList<>(2);
        art.add("1");
        art.add("1");
        art.add("1");
        for (String c : art) {
            System.out.println(c);
        }
        System.out.println("***********");




//        for (String c : new ArrayList<>(new TreeSet<>(list))) {
//            System.out.println(c);
//        }



    }

}
