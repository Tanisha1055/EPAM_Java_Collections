package org.child1.Collections.List.ArrayList.NormalFunction;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i;
        //Addition of elements
        for( i=0;i<5;i++)
        {
            arr.add(i);
        }
        //Get elements
        System.out.println(arr.get(2)); //index is passed
        //add at a particular index
        arr.add(1,2);
        System.out.println(arr);
        //see if that array contains
        System.out.println(arr.contains(3));

        //not the method of arraylist but linkedlist
//        //add first
//        arr.addFirst(1); //adding and printing simultaneously is not possible
//        //add last
//        arr.addLast(3);
//      //get first
//        System.out.println(arr.getFirst());
//        //get last
//        System.out.println(arr.getLast());


        //hascode of arr obj
        System.out.println(arr.hashCode());

        //rest method you see

        //it has array as it's internal implementation
        //after it is 50% full it doubles it's size(by creating new array of twice the size
        // and copying the elements , so check the size while inserting (in internal implememtation)
        //used when you want to get indexes quickly,random access , freq reads
        // (read operation)
        //real life example student roll numbers

        //Not thread-safe
        //can be made thread safe by:
        //1.
        List<Integer> arrts=Collections.synchronizedList(arr);
        //it returns a wrapper around the og one
        //so now the arrts is synchronised or thread-safe
        //arr is still the og one not thread-safe
        //returns a List , as it is generalised for all the List Interface
        //both arrts and arr are pointing to the same obj

        //if done by new ArrayList and the synchronisedList syntax it would have copied
        //  the elements and then thrown away the wrapper, so it would be of no use
        //it is better for writing as we don't have to copy the elements

        //2.
        CopyOnWriteArrayList<Integer> carr=new CopyOnWriteArrayList<>();
        //but the only thing is it copies the element everytime a thread is doing some operation
        //it is better for read operations as it has lock-free reads

    }

}
