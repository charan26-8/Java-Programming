package HashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        //Hashtable t=new Hashtable();//capacity is 11 ,load factor is 0.75
        //Hashtable t=new(initial capacity);//create hashtable object with some capacity
        //Hashtable t=new Hashtable(initialcapacity,fill ratio/loadfactor);
        Hashtable<Integer,String> t=new Hashtable<Integer,String>();
        t.put(100, "A");
        t.put(200, "John");
        t.put(300,"smith");
        t.put(400, "Dhoni");
        //t.put(null, "X");//Null pointer exception
        // t.put(102, null);//Null pointer exception
        //for(Map.Entry<Integer,String>)
        System.out.println(t);//{300=smith, 200=John, 100=A}
        System.out.println(t.get(300));//smith

        System.out.println(t.remove(100));
        System.out.println(t);//{300=smith, 200=John}

        System.out.println(t.containsKey(200));//true
        System.out.println(t.containsValue("John"));//true

        System.out.println(t.isEmpty());//false
        System.out.println(t.keySet());//[300, 200]

        System.out.println(t.values());//[smith, John]

        //for(int k:t.keySet()) {
        //	System.out.println(k+" "+t.get(k));//300 smith
        //200 John
        //}
        //Entry specific methods
		/*for(Map.Entry entry:t.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			//300 smith
			//200 John

		}*/
        //Iterator
        Set s=t.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()) {
            Map.Entry entry= (Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());//400 Dhoni
            //300 smith
            //200 John
        }


    }

}