class Node{
    int data;
    Node left,right;
    boolean rightThreaded;

}

Node leftMostNode(Node n){
    if(n == null){
        return null;
    }
    else{
        n = n.left;
    }
    return n;
}


public void inOrder(Node root){
    Node curr = leftMostNode(root);
    while(curr != null){
        System.out.println(curr.data+" ");

        if(curr.rightThreaded){
            curr = curr.right;
        }
        else{
            curr = leftMostNode(curr.right);
        }
    }
}


public class threadedBinaryTree {
    
    public static void main(String[] args) {
        
    }
}


