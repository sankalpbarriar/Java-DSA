package Arrays;
class ArrayExample{
    void demoArray(){
        int[] ages=new int[3];   //ages[0],ages[1],ages[2]
        float[] weights=new float[3];
        String[] names={"ajay","rahul","Aradhya"};

        ages[0]=34;
        ages[1]=12;
        ages[2]=45;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


    }
}
public class intri {
    public static void main(String[] args) {
        ArrayExample obj=new ArrayExample();
        obj.demoArray();
    }
}
