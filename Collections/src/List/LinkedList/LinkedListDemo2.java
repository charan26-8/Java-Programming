package List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedList l=new LinkedList();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");
        LinkedList l1=new LinkedList();
        l1.addAll(l);
        System.out.println(l1);//[X, Y, Z, A, B, C]
        l1.removeAll(l);
        System.out.println(l1);//[]
        //sort()
        System.out.println("Before Sorting:"+l);//Before Sorting:[X, Y, Z, A, B, C]
        Collections.sort(l);
        System.out.println("After Sorting:"+l);//After Sorting:[A, B, C, X, Y, Z]
        //reverse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Reverse order:"+l);//Reverse order:[Z, Y, X, C, B, A]
        //Shuffling
        Collections.shuffle(l);
        System.out.println("After Shuffling:"+l);//After Shuffling:[Y, C, A, X, Z, B]
    }

}
