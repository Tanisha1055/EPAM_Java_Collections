package org.child1.Collections.List.LinkedList.NormalFunction;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        //addition of elements
        ls.add(1);
        ls.add(2);
        System.out.println(ls); //you can't add inside sout as add returns void
        // and sout(void) is invalid

        //get elements
        System.out.println(ls.get(1)); //index

        //add first and add last with getfirst anf get kast , exists in linkedlist

        //this offer and add peek exists in linkedlist due to it's Deque implementation

        //offer is same as add , except the fact that it doesn't throw exception
        //in case of full list , but simply returns false
        ls.offer(3);
        System.out.println(ls);
        //returns the head (first element) of the list but doesn't remove it
        System.out.println(ls.peek());

        //linkedlist has doubly linkedlist for it's internal implemenation
        //used when you want to do frequent insertion and deletion (write operations)
        //real life example is train carriages

    }
}
