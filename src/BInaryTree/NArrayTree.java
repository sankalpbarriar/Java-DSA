package BInaryTree;

import java.util.ArrayList;
import java.util.*;

public class NArrayTree {
    class Node<E>{
        E data;
        ArrayList<Node> children;
        //constructor
        Node(E data){
            this.data = data;
            children = new ArrayList<>();
        }
    }

    public ArrayList<Integer> BFS(Node<Integer> root){
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node<Integer> node = queue.poll();
            res.add(node.data);
            //iske jitne bhi child hai usko queue me daal do
            for (Node child : node.children){
                if(child!= null){
                    queue.offer(child);
                }
            }
        }
        return res;
    }
}
