package List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        //using homogeneous data
        //LinkedList<Integer> ll1=new LinkedList<Integer>();
        //add elememts into inked list
        l.add(100);
        l.add("hi");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);
        System.out.println(l);//[100, hi, 15.5, A, true, null]

        System.out.println(l.size());//6
        l.remove(3);//index
        System.out.println("After removing,new list:"+l);//After removing,new list:[100, hi, 15.5, true, null]

        l.remove("hi");
        System.out.println("After removing,new list:"+l);//After removing,new list:[100, 15.5, true, null]
        //Insert /adding in the middle of linked list
        l.add(3,"Java");
        System.out.println("After inserting element :"+l);//After inserting element :[100, 15.5, true, Java, null]
        //retriving value/object
        System.out.println(l.get(3));//Java
        //change the value
        l.set(4, "X");
        System.out.println("After changing the value:"+l);//After changing the value:[100, 15.5, true, Java, X]
        //contains
        System.out.println(l.contains("Java"));//true
        System.out.println(l.contains("python"));//false
        //is Empty
        System.out.println(l.isEmpty());//false

        /*//Reading elements from ll using for loop
        for(int i=0;i<l.size();i++) {
        	System.out.println(l.get(i));//15.5 true Java X
        }*/
        //Readding elements from ll using for each loop
        for(Object e:l) {
            System.out.println(e);//100 15.5 true Java X

        }
        //iterator () method
        Iterator it=l.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());//100 15.5 true Java X
        }



    }

}