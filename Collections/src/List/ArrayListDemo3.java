package List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //convert array into arraylist
        String arr[]={"a","b","c","d"};
        for(String value:arr){
            System.out.print(value);//a, b, c, d
            System.out.println();
        }
        ArrayList al=new ArrayList(Arrays.asList(arr));
        System.out.println(al);//[a, b, c, d]
    }
}
