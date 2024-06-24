
package HashMaps;
import java.util.*;
public class Anagram {
    static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer>mp=new HashMap<>();
        int idxA=0,idxB=0;
        int n=s1.length();
        while (idxA<n && idxB<n){
            char charA= s1.charAt(idxA);
            mp.put(charA, mp.getOrDefault(charA,0)+1);
            char charB = s2.charAt(idxB);
            mp.put(charB, mp.getOrDefault(charB,0)-1);
            idxA++;
            idxB++;
        }
        for(char key: mp.keySet()){
            if(mp.get(key)!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="dabc";
        String str2="abce";
        System.out.println(isAnagram(str1,str2));
    }
}
