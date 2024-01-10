package Arrays;

public class swap {
    static void swapWithoutTemp(int a,int b){
        System.out.println("values before swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("values after swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    static void swapping(int a, int b){
        System.out.println("values before swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        int temp=a;  //temp=9
        a=b;         //a=3
        b=temp;      //b=9
        System.out.println("values after swap");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    public static void main(String[] args) {
           swapWithoutTemp(9,3);
    }
}
