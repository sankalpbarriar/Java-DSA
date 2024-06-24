package HashMaps;

import java.util.*;

public class HashMapMethods {
    static void Hashmpasmethods(){
       Map<String,Integer> mp=new HashMap<>();
       mp.put("Akash",21);
       mp.put("Yash",33);
       mp.put("Riya",19);
       mp.put("Lav",20);
       mp.put("Harry",18);
       System.out.println(mp);
       System.out.println(mp.get("Akash"));   //21
        System.out.println(mp.get("rahul"));   //null

        //Remove a pair from the hashmap
        System.out.println(mp.remove("Yash"));   //33
        System.out.println(mp.get("Yash"));  //null

        //Checking if key is there in the Hashmap
        System.out.println(mp.containsKey("Yash"));

        //putting in the map only if key does not exist
        mp.putIfAbsent("Yashika",23);
        System.out.println(mp);

        //getting all keys set from the map
        System.out.println(mp.keySet());

        //getting all value set from the map
        System.out.println(mp.values());

        //getting all entries from the map
        System.out.println(mp.entrySet());

        //Traversing through the map
        for(String key:mp.keySet()){
            System.out.printf("The age of %s is %d \n",key,mp.get(key));
        }
        System.out.println();

        //using entry set
        for (Map.Entry<String , Integer>e :mp.entrySet()){
            System.out.printf("The age of %s is %d\n",e.getKey(),e.getValue());
        }


        
    }

    public static void main(String[] args) {
        Hashmpasmethods();
    }
}
