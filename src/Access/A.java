package Access;
public class A {
    protected int num;
    public String name;
    protected int[] arr;

    public int getNum(){
        return num;
    }
    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
