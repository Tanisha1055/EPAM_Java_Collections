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