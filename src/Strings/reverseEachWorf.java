package Strings;

public class reverseEachWorf {
    public static void main(String[] args) {
        String str = "Sankalp is a good boy";
        String ans = "";      //creating ans string
        StringBuilder sb = new StringBuilder("");     //creating empty string builder
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch != ' ') {      //if space
                sb.append(ch);       //sb me daal do
            }
            else{
                sb.reverse();    //nahi to jo sb me hai usko reverse kar do
                ans+=sb;          //aur ans me daal ke ek space bhi daal do
                ans+=" ";
                sb.delete(0,sb.length());   //Empty stringBuilder

            }
        }

        //FOR LAST WORD
        sb.reverse();
        ans+=sb;
        System.out.println(ans);


    }
}
