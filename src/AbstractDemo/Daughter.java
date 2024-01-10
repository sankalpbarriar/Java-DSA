package AbstractDemo;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);     //constructor of parent class can be used in this way
    }

    @Override
    void career() {
        System.out.println("i am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I luv iron man");
    }
}
