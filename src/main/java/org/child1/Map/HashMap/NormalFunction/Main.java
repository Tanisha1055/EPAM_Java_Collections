package org.child1.Map.HashMap.NormalFunction;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      HashMap<Character,Integer> hmp=new HashMap<>();
      int i;
      //for addition we have put here
      for(i=0;i<5;i++)
          hmp.put((char)('a'+i),hmp.getOrDefault((char)('a'+i),0)+1);
        //for iteration we don't have iterator as it is not extending iterable class
        //we do for loop(enhanced for loop), with each entry of Map being
        //Map.Entry<char,int(type)> type where Map.Entry is an interface
        //This interface has methods like getValue() and getKey() def to use it
        //entrySet method retrieves all the entries of teh map in teh set form
        for(Map.Entry<Character,Integer> entry:hmp.entrySet())
        {
            //you need to convert it to char, otherwise it will convert it to integer
            //and in that keys , values won't be there
            char key=entry.getKey();
            int val=entry.getValue();
            System.out.println(key+"-"+val);
            //here in between I am also printing the values
            //to get value associated at that key, we give the key to the main hashmap
            System.out.println(hmp.get(key));
        }
        
        //real-life usage is to count freq count of the element, 
        // and do operation with key-val pairs 
        
        //internal implementation it uses hashcode() and equals() contract 
        //i.e. it has an array where each index is a LL (for collision) , so when inserting 
        //an element it checks the hashcode to decide the bucket , and when teh pos found , checks
        // if any element is present or not , if not then inserts it , if present then checks the entire list
        // with the equals method for matching element if found doesn't insert it as key should be unique 
        //else inserts,it . Collision is there as various obj may map to dame hashcode index,
        //but are internally different. Again LL is not better for large scale as in worst case scenario
        //all the elements may map to same index of the array so the searching time is O(N)
        //to reduce that we  can switch to binary-tree(Red-Black tree) in case of large no. of elements
        //so the searching time is O(log N) , in case of small number of elements we can switch back to LL
        //Now for retrival(get), we again find hashcode of the obj, then search in that position with equals
        //to find the exact element .
        //The structure of each node of the array of the internal linkedlist looks like:
        //{key,val,hashcode,next}

        //entrySet-set of key,value pairs
        //keySet-set of keys present inside the map
        //values-collection of values(as can have duplicate

        //to check whether it contains the key or not
        System.out.println(hmp.containsKey('e'));
        //to check whether it contains value
        System.out.println(hmp.containsValue(2));
        //to see the size of the hashmap
        System.out.println(hmp.size());

    }
}

