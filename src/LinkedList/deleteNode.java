package LinkedList;

public class deleteNode {
    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    static void delete(Node node){
        node.val=node.next.val;   //agle ka value isme daal do
        node.next=node.next.next;   //aur agle ko uda do
    }

    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(3);
        a.next=b;
        b.next=c;
    }
}
