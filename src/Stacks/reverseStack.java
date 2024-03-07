package Stacks;
import java.util.Stack;

public class reverseStack {
    static void pushAtBottom(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
        } else {
            int top = st.pop();
            pushAtBottom(st, item);
            st.push(top);
        }
    }

    static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int top = st.pop();
            reverse(st);
            pushAtBottom(st, top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);
        reverse(st);
        System.out.println("Reversed Stack: " + st);
    }
}
