package org.child1.Collections.List.Stack.NormalFunction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        //addition of elements
        st.add(1);
        st.add(2);
        System.out.println(st);
        //pop of elements(removes the head)
        st.pop();
        System.out.println(st);
        st.add(3);
        //get and all are list methods , i.e. available here , but isn't the property of stack
        //Stack is a legacy class. Deque should be used instead.

        //more stack specific stack item
        st.push(4);//on top of stack
        System.out.println(st);
    }
}
