class Stack{
    static final int max = 3;
    int top;
    int arr[] = new int[3];

    Stack(){
        top = -1;
    }

    boolean isEmpty(){
        return(top<0);
    }

    boolean push(int x){
        if(top>=(max-1)){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arr[++top] = x;
            System.out.println(x+" pushed into the stack");
            return true;
        }
    }
    int pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = arr[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x = arr[top];
            return x;
        }
    }
    void print(){
        for(int i=top;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
    }
}



public class stackArray{
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        
        System.out.print("Elements present in stack :");
        s.print();

        System.out.println("\nTop element is :"+s.peek());

        System.out.println(s.pop()+" popped from stack");

    }
}