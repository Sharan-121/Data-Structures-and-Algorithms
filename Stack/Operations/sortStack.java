import java.util.Stack;

public class sortStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(5);
        st.push(-9);
        st.push(2);
        st.push(10);
        System.out.println(st);
        sortStack(st);
        System.out.println(st);
    }

    public static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int temp = st.pop();
        sortStack(st);
        insertSort(st, temp);
    }

    public static void insertSort(Stack<Integer> st, int elem) {
        if (st.isEmpty() || elem > st.peek()) {
            st.push(elem);
            return;
        }

        int topElement = st.pop();
        insertSort(st, elem);
        st.push(topElement);
    }

}