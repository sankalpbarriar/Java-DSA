package Strings;

public class ReverseWords2 {
    static void reverse(char[] arr, int SP, int EP){
        while(SP<EP){
            char temp=arr[SP];
            arr[SP]=arr[EP];
            arr[EP]=temp;
            SP++;
            EP--;
        }
    }
    static String reverseWords(String s){
        //convert to char array
        char[] arr=s.toCharArray();
        int len=arr.length;
        int SP=0;
        for (int EP=0;EP<=len;EP++){
            // word will end at space or end of string
            if (EP==len || arr[EP]==' '){
                reverse(arr,SP,EP-1);
                // first char of next word me jaane ke liye
                SP=EP+1;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
           String s="i love you";
        System.out.println(reverseWords(s));
    }
}
