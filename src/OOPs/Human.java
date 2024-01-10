package OOPs;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    static void message(){
        System.out.println("hello World");
//        System.out.println(this.age);   //cant use this here
    }

    //calling constructor
    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
        Human.message();   //cant use this.message
    }
}
