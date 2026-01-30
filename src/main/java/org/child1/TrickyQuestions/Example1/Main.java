package org.child1.TrickyQuestions.Example1;

import java.util.HashMap;
import java.util.Map;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();

        Employee e1 = new Employee(1, "A");
        Employee e2 = new Employee(1, "A");

        map.put(e1, "First");
        map.put(e2, "Second");

        System.out.println(map.size());
    }
}

//Answer:
//2

//Why:

//equals() and hashCode() not overridden
//So e1 and e2 are treated as different keys

//Fix:
//Override equals() and hashCode()

//📌 Interview line:
//“HashMap works on hashCode first, then equals.”

//By default this new keyword will make a new Object with different hashCode, so the
//object will be treated differently. By the HashMap , as HashMap sees the hashCode
//first

//On the other hand if we would have added the same obj (reused the same obj) , it would
//have gotten overidden