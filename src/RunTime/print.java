package RunTime;

public class print {
    int num;
    public print(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return "object is the "+num;
    }


    public static void main(String[] args) {
        print obj=new print(56);
        System.out.println(obj.toString());
    }
}
