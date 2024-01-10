package OOPs;
//this is the demo to show initialisation of static variables
public class StaticBlock {
    static int a=4;
    static int b;
    static {
        System.out.println("I am in static block");

    }

    public static void main(String[] args) {
        System.out.println("hello main");
    }
}
