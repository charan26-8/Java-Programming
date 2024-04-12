package HashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //LinkedHashSet<Integer> lhset=new LinkedHashSet<Integer>();
        LinkedHashSet lset=new LinkedHashSet();
        //insetion order follows in linkedhashset and not in hashset
        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);
        System.out.println(lset);//[100, 200, 300, 400, 500]


    }

}