import java.util.*;

public class reverseKElements {

    static Queue<Integer> queue;
   public static void main(String[] args) {
       queue = new LinkedList<Integer>();
       queue.add(10);
       queue.add(20);
       queue.add(30);
       queue.add(40);
       queue.add(50);
       queue.add(60);
       queue.add(70);

       int k = 5;
       reverse(5);
       System.out.println(queue);
       
   } 

   static void reverse(int k){
        if(queue.isEmpty() == true || k>queue.size()|| k<=0){
            return;
        }

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0;i<k;i++){
            stack.push(queue.peek());
            queue.remove();
        }
        while(!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }
        for(int i = 0;i<queue.size()-k;i++){
            queue.add(queue.peek());
            queue.remove();
        }

   }

}
