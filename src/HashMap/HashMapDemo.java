package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
       //HashMap m=new HashMap();
        HashMap <Integer,String> m=new HashMap<Integer,String>();
        m.put(101,"ale");
        m.put(102,"vali");
        m.put(103,"mary");
        m.put(104,"tail");
        m.put(105,"Head");
        m.put(103,"x");//{101=ale, 102=vali, 103=x, 104=tail, 105=Head} duplicate keys are not allowed so it takes new key and old key is not taken in the map
        System.out.println(m);//{101=ale, 102=vali, 103=mary, 104=tail, 105=Head}

        System.out.println(m.get(105));//Head

        m.remove(103);//remove pair from hashmap
        System.out.println(m);//{101=ale, 102=vali, 104=tail, 105=Head}

        System.out.println(m.containsKey(102));//true
        System.out.println(m.containsValue("hello"));//false
        System.out.println(m.isEmpty());//false

        /*System.out.println(m.keySet());//it will return all keys as set collection//[101, 102, 104, 105]
        for(Object i:m.keySet()){
            System.out.print(i+" ");//101 102 104 105

        }*/
        /*for(Object i:m.keySet()){
            System.out.print(i+"  "+m.get(i)+" ");//101  ale 102  vali 104  tail 105  Head
        }*/

       /*System.out.println(m.values());//it will return values as a collection //[ale, vali, tail, Head]
       for(Object i:m.values()){
           System.out.print(i+" ");//ale vali tail Head


       }*/
        //System.out.println(m.entrySet());//return all the entries as set//[101=ale, 102=vali, 104=tail, 105=Head]
     //Entry Methods
       // *******
        /*for(Map.Entry entry :m.entrySet()){
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }*/
        //Iterator
        Set s=m.entrySet();
        Iterator itr =s.iterator();
        while(itr.hasNext()){
            Map.Entry entry= (Map.Entry)itr.next();//
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }





    }
}
