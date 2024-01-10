package Access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    //details in how to create in hashmap
    @Override
    public int hashCode() {         //returns the hashcode number for this object.
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(43,56.7f);
        ObjectDemo obj1=new ObjectDemo(43,56.7f);
        if(obj.equals(obj1)){
            System.out.println("Obj is equal than obj1");
        }
        if (obj==obj1){
            System.out.println("Equal hai bhai");
        }
//        System.out.println(obj.hashCode()); //gives just a unique number
//        System.out.println(obj1.hashCode());

    }
}
