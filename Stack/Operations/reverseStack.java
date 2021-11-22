import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);

        reverse(st);
        System.out.println(st);
    }

    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int temp = st.pop();
        reverse(st);

        insertAtBottom(st, temp);
    }

    public static void insertAtBottom(Stack<Integer> st, int elem) {
        if (st.isEmpty()) {
            st.push(elem);
            return;
        }

        int topElement = st.pop();
        insertAtBottom(st, elem);
        st.push(topElement);
    }
}