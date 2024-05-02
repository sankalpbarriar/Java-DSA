package Queue;

public class circularQueue {
    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[100];

        //add function
        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            } else if (size == 0) {
                front = 0;
                rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }

        //remove function
        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty! ");
            } else {
                int val = arr[front];
                if (front == arr.length - 1) front = 0;
                else front++;
                size--;
                return val;
            }

        }

        //display function
        public void display() {
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            } else if (rear < front) {
                for (int i = front; i <= arr.length - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.println(arr[i] + " ");
                }
                System.out.println();
            }
        }

        //peek funtion
        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            } else {
                return arr[front];
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Cqa q=new Cqa();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
    }
}
