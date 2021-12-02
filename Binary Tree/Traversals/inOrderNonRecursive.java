import java.util.Stack;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.right = this.left = null;
    }
}

class Solution1 {
    Node root;

    void inOrderNonRecursive() {
        if (root == null) {
            return;
        }

        Stack<Node> stk = new Stack<Node>();
        Node curr = root;

        while (curr != null || !stk.isEmpty()) {
            while (curr != null) {
                System.out.println(curr.data + " ");
                stk.push(curr);
                curr = curr.left;
            }
            curr = stk.pop();
            curr = curr.right;
        }
    }

}

public class inOrderNonRecursive {
    public static void main(String[] args) {
        Solution1 tree = new Solution1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.right = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.right.left.right = new Node(7);
        tree.inOrderNonRecursive();
    }
}