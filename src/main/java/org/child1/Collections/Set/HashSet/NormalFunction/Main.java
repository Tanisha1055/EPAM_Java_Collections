package org.child1.Collections.Set.HashSet.NormalFunction;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
      //internally it uses hashmap as the data structure,it stores key and dummy val.
        HashSet<Integer> hs=new HashSet<>();
        //addition
        hs.add(1);
        hs.add(2);
        hs.add(1);
        //removes duplicate (as all key should be unique)
        System.out.println(hs);

        //these methods have been inherited from List Interface so is common for all
        //to know size
        System.out.println(hs.size());
        //to check whether empty
        System.out.println(hs.isEmpty());
        //to see wheather it contains something
        System.out.println(hs.contains(2));
        //to convert to array
        hs.toArray();
        //for removal
        hs.remove(1);
        System.out.println(hs);

        //real-life usage: used to store unique phone numbers in real life

        //it is not synchronised
    }
}
