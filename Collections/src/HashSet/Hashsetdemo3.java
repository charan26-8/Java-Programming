package HashSet;

import java.util.HashSet;

public class Hashsetdemo3 {
    public static void main(String[] args) {
        //union ,Intersection ,differnce
        HashSet <Integer> set1=new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Hashset 1: "+set1);//Hashset 1: [1, 2, 3, 4, 5]

        HashSet<Integer> set2=new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Hashset 2: "+set2);//Hashset 2: [3, 4, 5]

        //set1.addAll(set2);

        //System.out.println("Union :"+set1);//Union :[1, 2, 3, 4, 5]

		/*Intersection
		set1.retainAll(set2);
		System.out.println("Intersections: "+set1);//Intersections: [3, 4, 5]
		*/
        //differnce in sets
        set1.removeAll(set2);
        System.out.println("Differnce :"+set1);

        //subset
        System.out.println(set1.containsAll(set2));//true
        set1.containsAll(set2);
        System.out.println("Subset:"+set1);//Subset:[1, 2, 3, 4, 5]


    }

}