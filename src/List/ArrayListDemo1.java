package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Declare arraylist
        //handle heterogeneous data
       // ArrayList al=new ArrayList();
        //homogeneous data use below
       // ArrayList <Integer> al=new ArrayList<Integer>();
        //ArrayList <String> al=new ArrayList<String>();
       //List al=new ArrayList();
        ArrayList al=new ArrayList();
        //add new Elements to the arraylist
        al.add(100);
        al.add("welcome");
        al.add(17.9);
        al.add('a');
        al.add(true);
        System.out.println(al);//[100, welcome, 17.9, a, true]
        //size
        System.out.println("Number of elements="+al.size());//Number of elements=5
        //remove
        al.remove(1);

        System.out.println("After removing element from arraylist"+al);//After removing element from arraylist[100, 17.9, a, true]
        //insert a new element in the middle of the  arraylist use add method
        //add(index,object)
        al.add(2,"Python");
        System.out.println("After insertion :"+al);//After insertion :[100, 17.9, Python, a, true]
        //retrieve specific element
        al.get(3);
        System.out.println(al.get(3));//a
        //change element/replace
        al.set(2,"Java");
        System.out.println("After replacing a new element="+al);//After replacing a new element=[100, 17.9, Java, a, true]
        //search -contains()-returns true or false
        System.out.println(al.contains("Java"));//true
        System.out.println(al.contains("java"));//false

        //isEmpty()-returns true or false
        System.out.println(al.isEmpty());//false
        //How to read the data from arraylist
        //1.for loop 2.for-each loop 3.iterator()
        //for loop
        System.out.println("Reading elements using for loop..");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        //for each loop
        System.out.println("Reading elements using for-each loop..");
        for(Object e:al){
            System.out.println(e);
        }
     //using iterator method
        System.out.println("Reading elements using iterator method..");
        Iterator it=al.iterator();
        while(it.hasNext()){//dintlo elements untae true vasthadhi lekapothe out of loop and if it has the elemnts returns true and it will got to the method and it will print the value of nextwo
            System.out.println(it.next());//printing the elemnt and move to next
        }
    }
}
