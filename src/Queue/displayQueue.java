package Queue;
import java.util.*;
public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>r=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //q ko khali kar ke r me daal do
        while(q.size()!=0){
            int ele=q.remove();
            System.out.print(ele+" ");
            r.add(ele);
        }
        //wapas q ,e dall do
        while(r.size()!=0){
            q.add(r.remove());
        }
        System.out.println(q);
    }
}
