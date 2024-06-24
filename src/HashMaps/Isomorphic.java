package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> mp=new HashMap<>();
        HashSet<Character>st=new HashSet<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            Character sCh=s.charAt(i);
            Character tCh=t.charAt(i);
            if(mp.containsKey(sCh)) {
                if (mp.get(sCh) != tCh) return false;
            } else if(st.contains(tCh)) {
                return false;
            }
            else {
                mp.put(sCh,tCh);
                st.add(tCh);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="add";
        String t="egg";
        System.out.println("Is Isomorphic "+ isIsomorphic(s,t));
    }
}
