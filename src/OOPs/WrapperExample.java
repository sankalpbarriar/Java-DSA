package OOPs;

public class WrapperExample {
    public static void main(String[] args) {

        Integer num1=45;   //num is a object of Integer class
        Integer num2=46;
        swap(num1,num2);
        System.out.println(num1 +" "+num2);


    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }


}


