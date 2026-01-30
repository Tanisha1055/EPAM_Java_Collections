package org.child1.TrickyQuestions.Example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list) {
            if (i == 2) {
                list.remove(i);
            }
        }


//Answer:
//❌ ConcurrentModificationException

//Fix:

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == 2) {
                it.remove();
            }
        }
    }
}

//Theory:
//“Fail-fast iterators protect against structural modification.”

//What’s Happening in Your Code?

//List<Integer> list = new ArrayList<>();
//list.add(1);
//list.add(2);
//list.add(3);
//
//for (Integer i : list) {
//    if (i == 2) {
//        list.remove(i); // <-- Problem here!
//    }
//}

//You are using an enhanced for loop (for-each loop) to iterate over the list.
//Inside the loop, you try to remove an element (2) from the list while iterating.

//Why does this cause ConcurrentModificationException?

//The enhanced for loop uses an iterator behind the scenes to go through the list.
//If you modify the list’s structure (add or remove elements) directly (not through
//the iterator) while iterating, the iterator detects this and throws a
//ConcurrentModificationException.
//This is called a fail-fast behavior: the iterator “fails fast” to prevent
//unpredictable results or bugs.

//How does the iterator detect this?

//The ArrayList (and most Java collections) keeps a modification count (modCount).
//The iterator checks if the list’s modCount has changed since it was created.
//If you modify the list directly (not through the iterator), modCount changes, and
//the iterator throws the exception the next time you use it.