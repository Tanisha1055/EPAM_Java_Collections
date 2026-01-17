package org.child1.Map.ConcurrentHashMap.NormalFunction;

import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        //works like hashmap, but is thread-safe
        ConcurrentHashMap<Integer,Integer> chmp=new ConcurrentHashMap<>();
        //addition of elements
        chmp.put(1,5);
        chmp.put(3,8);
        System.out.println(chmp);
        //it also has arrays of bucket, each will be LL, or Red-Black Tree acc to size
        //it also has CAS and fine-grained locking
        //it sees and Compare and Swap(CAS) , if the value is already present at the key
        //by fine-grained locking we mean that, it locks the index whose hashcode has been matched
        //to prevent other thread from working on that index, so it locks a portion of the map
        //as synchronised so bit slow than hashmap
    }
}
