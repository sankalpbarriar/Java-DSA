package WrapperClass;
import java.util.ArrayList;
import java.util.Collections;
public class reversingtring {
    public static void main(String[] args) {
        ArrayList<String>l1=new ArrayList<>();
        l1.add("sankalp");
        l1.add("is");
        l1.add("a");
        l1.add("good");
        l1.add("boy");
        System.out.println("ORIGINAL "+l1);
        Collections.sort(l1);
        System.out.println("SORTED "+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("REVERSE ORDER "+l1);
    }
}
