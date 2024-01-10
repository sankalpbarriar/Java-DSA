package Strings;

import java.util.Arrays;

public class Anagrams {
    static boolean isAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        // convert them to char arrays
        char arrA[] = a.toCharArray();
        char arrB[] = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int idxA = 0, idxB = 0;
        int len = arrA.length;
        while (idxA < len && idxB < len) {
            //Compare each character of the char Array
            if (arrA[idxA] != arrB[idxB]) return false;
            else {
                idxA++;
                idxB++;
            }
        }
        return true;

    }

    static boolean isAnagrams2(String a, String b) {
        if (a.length() != b.length()) return false;
        int freq[] = new int[26];

        int len = a.length();
        int idxA = 0, idxB = 0;
        while (idxA < len && idxB < len) {
            char charA = a.charAt(idxA);
            int freqIdxA = charA - 97;

            freq[freqIdxA] += 1;
            char charB = b.charAt(idxB);
            int freqIdxB = charB - 97;

            freq[freqIdxB] -= 1;
            idxA++;
            idxB++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] !=0) return false;
        }
    return true;
}
    public static void main(String[] args) {
        String a="chocos";
        String b="sochoc";
        System.out.println(isAnagrams2(a,b));

    }
}
