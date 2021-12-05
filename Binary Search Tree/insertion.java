public class insertion{

    class Node{
        int data;
        Node left,right;

        public Node(int item){
            this.data = item;
            this.right = this.left = null;
        }
    }

    Node root;

    insertion(){
        root = null;
    }

    void insert(int key){
        root = recursiveInsert(root,key);
    }
    Node recursiveInsert(Node root, int key) {
        if(root == null){
            root = new Node(key);
            return root;
        }

        if(root.data > key){
            root.left = recursiveInsert(root.left, key);
        }
        else if(root.data < key){
            root.right = recursiveInsert(root.right, key);
        }
        return root;
    }
    void inOrderRecur(){
        inOrder(root);
    }
    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.data+" ");
            inOrder(root.right);
        }
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
    }
}