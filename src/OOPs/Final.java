package OOPs;

public class Final {
    public static void main(String[] args) {
        final A kunal=new A("Kunal Kushwaha");
        kunal.name="Sanklp";  //this is allowed

        //when a non primitive is final, you cannot reassign it.
//        kunal=new A("other");
    }
}
class A{
    final int num=10;
    String name;

    public A(String name){
        this.name=name;
    }
}
