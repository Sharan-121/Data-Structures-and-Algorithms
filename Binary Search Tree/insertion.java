public class insertion {

    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            this.data = item;
            this.right = this.left = null;
        }
    }

    Node root;

    insertion() {
        root = null;
    }

    void insert(int key) {
        root = recursiveInsert(root, key);
    }

    Node recursiveInsert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.data > key) {
            root.left = recursiveInsert(root.left, key);
        } else if (root.data < key) {
            root.right = recursiveInsert(root.right, key);
        }
        return root;
    }

    void inOrderRecur() {
        inOrder(root);
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }
    }

    public boolean search(int data) {
      root =  searchBST(root, data);
      if(root!=null){
          return true;
      }
      else{
          return false;
      }
    }

    Node searchBST(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        } else if (key < root.data) {
            searchBST(root.left, key);
        }

        return searchBST(root.right, key);
    }

    public static void main(String[] args) {
        insertion obj = new insertion();
        obj.insert(50);
        obj.insert(30);
        obj.insert(20);
        obj.insert(40);
        obj.insert(70);
        obj.insert(60);
        obj.insert(80);
        obj.inOrderRecur();
        // System.out.println(obj.search(40));

    }
}