package BitManipulation;

public class swap {
    static void swapping(int a, int b){
        System.out.println("BEFORE SWAPPING a: "+a);
        System.out.println("BEFORE SAPPING b: "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("AFTER SWAPPING a: "+a);
        System.out.println("AFTER SAPPING b: "+b);
    }
    public static void main(String[] args) {
        swapping(3,5);

    }
}
