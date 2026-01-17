package org.child1.Collections.Set.TreeSet.NormalFunction;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //when you want sorted unique order
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(2);
        ts.add(1);
        //sorted order is maintained
        System.out.println(ts);

        //in real-life it is used in sorted student attendance register

        //internally it uses treemap as the data structure, with keys as the obj
        //and dummy values as the value
    }
}
