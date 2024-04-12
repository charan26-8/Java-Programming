package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        // Adding elemnts  add() offer()
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer(100);//not allowed in queue (Hetergeneous data is not allowed)
        System.out.println(q);//[A, B, C, C] insertion order preserved and duplicats are allowed

        //get head element element() peek()
        //System.out.println(q.element());//A//if elemnt is not there in queue it wil throw an exceptionNoSuchElementException
       //System.out.println(q.peek());//A if elemt is not there in queue it show null

        //Return head and remove head element from queue
        //remove() poll()
        //System.out.println(q.remove());//A //Exception if there is no elemnt in  the queue
        //System.out.println(q);//[B, C, C]
        //System.out.println(q.poll());//A null if there is no element in the queue
        //System.out.println(q);//[B, C, C]
       /* Iterator it=q.iterator();
        while(it.hasNext()){
            System.out.print(it.next());//ABCC
        }*/
        for(Object e:q){
            System.out.println(e);//ABCC
        }

    }
}
