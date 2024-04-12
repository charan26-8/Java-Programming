package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("X");
        al.add("y");
        al.add("Z");
        al.add("A");
        al.add("B");
        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);
        System.out.println(al_dup);//[X, y, Z, A, B]
       al_dup.removeAll(al);

       System.out.println("After removing all elements in an arraylist: "+al_dup);//After removing all elements in an arraylist: []
       //sort --- Collections.sort()
        System.out.println("elements in the arraylist:"+al);//elements in the arraylist:[X, y, Z, A, B]
        Collections.sort(al);
        System.out.println("Elements in the arraylist after sorting:"+al);//Elements in the arraylist after sorting:[A, B, X, Z, y]
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements in the arraylist after sorting in reverse Order:"+al);//Elements in the arraylist after sorting in reverse Order:[y, Z, X, B, A]
    //shuffling -Collections .shuffle()
        Collections.shuffle(al);
        System.out.println("Elemnts in the array list after shuffling:"+al);//


    }

}
