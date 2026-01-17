package org.child1.Collections.Queue.PriorityQueue.NormalFunction;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //Priority queue has heap as it's data structure, and it is min-heap by default
        //heap is nothing but complete binary-tree , stored in array form with the rule
        //parent<=children(in case of min-heap) , and oppo in case of max-heap
        //rule of indexes of parent and child in array is that :
        //for i node of the tree, parent=i/2, left child=2*i and right=2*i+1;

        //Min-Heap
        PriorityQueue<Integer> minpq=new PriorityQueue<>();
        //for addition
        minpq.add(10);
        minpq.add(20);
        minpq.add(30);
        //to see the topmost
        minpq.peek();
        //to remove the topmost
        minpq.poll();

        //Max-Heap
        PriorityQueue<Integer> maxpq=new PriorityQueue<>(Collections.reverseOrder());
        //for addition
        minpq.add(10);
        minpq.add(20);
        minpq.add(30);
        //to see the topmost
        minpq.peek();
        //to remove the topmost
        minpq.poll();

        //Custom-sorting in case of Objects
//        PriorityQueue<Integer> cuspq=new PriorityQueue<>((a,b)->{
//            if(a.priority==b.priority)
//                return a.name.compareTo(b.name); //return statement should return int
           //and strings compareTo only returns int ,not direct substraction as
           // only char gets converted to ascii values

//            else
//                return a.priority-b.priority; //it is directly integer
//        });
    }
}