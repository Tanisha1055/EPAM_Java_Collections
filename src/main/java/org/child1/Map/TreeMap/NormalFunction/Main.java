package org.child1.Map.TreeMap.NormalFunction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //sorted key-val pairs
       TreeMap<Integer,Integer> tmp=new TreeMap<>();
       //to put items
       tmp.put(1,7);
       tmp.put(2,0);
        System.out.println(tmp);
       //we have normal keySet() to get the keys
        System.out.println(tmp.keySet());
        //we also have descendingKeySet() to get key in descending order
        System.out.println(tmp.descendingKeySet());
       //internally uses Red-Black tree as data-structure for implementation
       //real-life used in dictionaries
    }
}
