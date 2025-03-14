package LinkedList;

class SLL{
    Node head;
    class Node{
        int data;
        Node next;
        //constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void printList(){
        if(head == null){
            System.out.println("Empty List");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void deleteFirst(){
        if(head == null){
            System.out.println("List Empty");
        }
        head = head.next;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void deleteLast(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
}
public class implentation {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.printList();
        list.addFirst(23);
        list.addFirst(45);
        list.addFirst(22);
        list.addFirst(76);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
//        list.addLast(58);
//        list.printList();

    }
}
