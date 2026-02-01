package org.child1.TrickyQuestions.Example3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = arr1;

        System.out.println(arr1 == arr2);
        System.out.println(arr1.equals(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(arr1 == arr3);

    }
}

//Answer:
//false
//false
//true
//true

//1️⃣ arr1 == arr2
//== compares references, not values.
//arr1 and arr2 point to different array objects.
//❌ Output: false

//arr1.equals(arr2)
//Arrays do NOT override equals()
//So this calls Object.equals() → reference comparison
//❌ Output: false

//3️⃣ Arrays.equals(arr1, arr2)
//Compares contents element-by-element
//1 == 1, 2 == 2, 3 == 3
//✅ Output: true

//4️⃣ arr1 == arr3
//arr3 references the same array object as arr1
//✅ Output: true