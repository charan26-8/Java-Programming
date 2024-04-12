package Queue;

import java.util.LinkedList;

public class QueueDemo2 {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.offer(100);//not allowed in queue (Hetergeneous data is not allowed)
        ll.offer("C");

        System.out.println(ll);//[A, B, C, 100, C]
        //methods are same as priority queue and linked list only diiference is hetergeneous data is not allowed
    }
}
