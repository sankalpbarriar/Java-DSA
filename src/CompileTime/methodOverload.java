package CompileTime;

public class methodOverload {

    double sum(double a,int b){
        return a+b;
    }
    double sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b;
    }

    public static void main(String[] args) {
        methodOverload obj=new methodOverload();
        obj.sum(4,6,7);
        obj.sum(43,7);
       // obj.sum(4,5,6,8);
    }
}
