package AbstractDemo;

abstract public class Parent {   //if class contains onr or more abstract methods it should also be declared Abstract
    abstract void career();   //Abstract methods
    abstract void partner();
    int age;

    public Parent(int age) {
        this.age = age;
    }
}
