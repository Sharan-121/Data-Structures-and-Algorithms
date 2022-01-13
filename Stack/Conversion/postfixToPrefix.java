import java.util.Stack;


public class postfixToPrefix {
    static int operatorCheck(char x){
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
                return 1;
            default:
                return 0;
        }
    }

    public static String Convert(String str){
        Stack<String> stack = new Stack<>();
        
        for(int i= 0;i<str.length();i++){
            char c = str.charAt(i);
            if(operatorCheck(c)==1){
                String opr1 = stack.pop();
                String opr2 = stack.pop();

                String temp = c+opr2+opr1;
                stack.push(temp);
            }
            else{
                stack.push(c+"");
            }

        }
        return stack.pop();


    }

    public static void main(String args[]){
        String exp = "ABC/-AK/L-*";
        System.out.println("Prefix : " + Convert(exp));
        
    } 
}
