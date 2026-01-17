package org.child1.Collections.Queue.ArrayDeque.NormalFunction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Now a little theory about Arraydeque ,
        //it is used for insertion at front and at back
        //it uses circular array as it's internal implementation
        //circular array you maintain head and tail ref, so you can shift them as per
        //insertion and deletion, unlike array, where you would have to shift all elements

        //it can be used both as stack and Queue
        //it is faster than Stack as Stack is synchronized so is thread-safe, hence slow
        //Stack is a legacy class
        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.pop();
        System.out.println(stack);

        //As a Queue it is faster than if used LinkedList
        // (LL implements both List and Queue Interface)
        //LL is slow as each node has data,prev,next values , which occupies more space and
        // more complex to manage, there is a overhead associated with each obj ,
        // unlike here(ArrayDeque) the node size is small

        Deque<Integer> queue=new ArrayDeque<>();
        queue.offer(30);
        queue.offer(40);
        //for removal we have this method specified
        queue.poll();
        System.out.println(queue);

        //real life example undo/redo, customer queue

    }
}
