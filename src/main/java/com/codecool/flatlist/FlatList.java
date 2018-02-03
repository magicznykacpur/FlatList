package com.codecool.flatlist;

import java.util.*;

public class FlatList {


    public static Collection<Object> flattenList(Object object) {

        Collection<Object> flattendList = new ArrayList<Object>();

        if (object instanceof Iterable) {
            for (Object element : (Iterable<?>) object) {
                flattendList.addAll(flattenList(element));
            }
        } else
            flattendList.add(object);

        return flattendList;
    }


    public List<Object> createMultiList() {
        List<Object> aList = new ArrayList<Object>();
        List<Object> bList = new ArrayList<Object>();
        List<Object> cList = new ArrayList<Object>();

        aList.add(1);
        aList.add("mateusz");
        aList.add(34);

        bList.add(aList);
        bList.add("codecool");
        bList.add(3);

        cList.add(aList);
        cList.add(bList);
        cList.add(1);
        cList.add(2);
        cList.add(7);

        return cList;
    }

    public static void main(String[] args) {
        FlatList flatList = new FlatList();
        List<Object> list = flatList.createMultiList();

        System.out.println(flattenList(list));
    }
}
