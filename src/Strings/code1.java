package Strings;

public class code1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "indian";
        int[] freq = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx] ++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int idx = ch - 97;
            if(freq[idx] == 1){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
