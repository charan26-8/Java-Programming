package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo1 {
    public static void main(String[] args) {
        //HashSet hs=new HashSet();//default capacity =16 and load factor is 0.75
        //HashSet hs=new HashSet(100);//initial capacity 100
        //HashSet hs=new HashSet(100,(float)0.90);
        //similar Kind of objects
        //HashSet<Integer> hs=new HashSet<Integer>();
        HashSet hs=new HashSet();
        //Add objects /elements into hashset
        hs.add(100);
        hs.add("hi");
        hs.add(19.3);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);//[null, hi, A, 100, 19.3, true]insertion order not preserverd
        //remove
        hs.remove(19.3);//value
        System.out.println("After removing element or object:"+hs);//After removing element or object:[null, hi, A, 100, true]
        //contains ()
        System.out.println(hs.contains("hi"));//true
        System.out.println(hs.contains("wx"));//false
        System.out.println(hs.isEmpty());//false

		/*read the data or elments from hashset
		for(Object e:hs) {
			System.out.println(e);//null hi A 100 true


		}*/
        Iterator it=hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }




    }

}