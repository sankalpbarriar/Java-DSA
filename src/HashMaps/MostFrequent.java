package HashMaps;

import java.util.HashMap;

public class MostFrequent {
    static int mostFrequentElement(int[] arr){
        HashMap<Integer,Integer> mp=new HashMap<>();
//        for(int key:arr){
//            mp.put(key, mp.getOrDefault(key,0)+1);
//        }
        for(int key: arr){
            if(!mp.containsKey(key)){
                mp.put(key,1);
            }
            else{
                int i=mp.get(key);
                mp.put(key,++i);
            }
        }
        //finding max frequency key
        int maxFreq=-1;
        int ansKey=-1;
        for(int key:mp.keySet()){
            if(mp.get(key)>maxFreq){
                maxFreq=mp.get(key);
                ansKey=key;
            }
        }
        return ansKey;
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,1,4,1};
        System.out.println(mostFrequentElement(arr));
    }
}
