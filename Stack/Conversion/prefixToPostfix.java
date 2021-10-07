import java.util.Stack;



public class prefixToPostfix {
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
        
        for(int i= str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if(operatorCheck(c)==1){
                String opr1 = stack.pop();
                String opr2 = stack.pop();

                String temp = opr1+opr2+c;
                stack.push(temp);
            }
            else{
                stack.push(c+"");
            }

        }
        return stack.pop();

    }

    public static void main(String args[]){
        String exp = "*-A/BC-/AKL";
    System.out.println("Postfix : " + Convert(exp));
        
    } 
}

