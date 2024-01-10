package Strings;

public class toggleII {
    public static void main(String[] args) {
        String str="PhySicS";
        for (int i=0;i<str.length();i++){
            //check the alphabet is small or capital
            boolean flag=true;   //true-> capital
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci >=97)  flag=false;    // small
            if (flag==true){
                asci+=32;             // A(65) +32= a(97)
                char dh=(char)asci;   //typecast the character
                str=str.substring(0,i)+dh+str.substring(i+1);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str=str.substring(0,i)+dh+str.substring(i+1);
            }
        }
        System.out.println(str);
    }

}
