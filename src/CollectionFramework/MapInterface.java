package CollectionFramework;
import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String>mp=new HashMap<>();
        mp.put(3,"Sankalp");
        mp.put(4,"pradeep");
        mp.put(5,"Riya");
        System.out.println(mp);
        System.out.println(mp.get(4));
        System.out.println(mp.containsKey(2));
        mp.put(3,"Ramesh");    //overrides original value
        System.out.println(mp);
        mp.putIfAbsent(3,"Ram");  //can't override if already present
        System.out.println(mp);
        System.out.println(mp.containsKey(2));  //false

        //Iterating over keyset
        for(var i: mp.keySet()){
            System.out.print(i+" ");   //3,4,5
        }
        System.out.println();

        //Iterating over keys and values
        for(var i: mp.entrySet()){
            System.out.print(i);    //3=Ramesh4=pradeep5=Riya
        }

    }
}
