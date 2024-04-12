package Queue;

import java.util.*;
public class Ardeque {
    public static void main(String[] args) {
        //Creating Ardeque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");

        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
