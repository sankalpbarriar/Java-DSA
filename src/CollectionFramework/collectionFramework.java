package CollectionFramework;
import java.util.*;

public class collectionFramework {
    static void QueueExample(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());  //1
        System.out.println(q.size());
        System.out.println(q);
        System.out.println(q.isEmpty());  //false
    }
    static void PriorityQueueExample(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();  //min pq
//        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());  //max pq
        pq.add(2);
        pq.add(14);
        pq.add(5);
        System.out.println(pq.peek());
        System.out.println(pq);  //Guarantee-> top-most priority ele will be processed first
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
    static void DequeExample(){
        //Arraydeque is a class implementing Deque interface
        Deque<Integer>dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);

    }
    public static void main(String[] args) {
//        QueueExample();
//        PriorityQueueExample();
        DequeExample();
    }
}
