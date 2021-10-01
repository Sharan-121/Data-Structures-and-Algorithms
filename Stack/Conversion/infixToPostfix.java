import java.util.Stack;
import static java.lang.System.exit;

public class infixToPostfix{
	static int isOperator(char input){
		switch(input){
			case '+':
				return 1;
			case '-':
				return 1;
			case '*':
				return 1;
			case '%':
				return 1;
			case '/':
				return 1;
			case '^':
				return 1;
			case '(':
				return 1;
			case ')':
				return -1;
			default:
				return 0;
	    }
		
	}
	static int inPrec(char input){
		switch(input){
		case '+':
		case '-':
			return 2;
		case '*':
		case '/':
			return 3;
		case '^':
			return 4;
		case '(':
			return 0;
		}
		return 0;
	}
	static int outPrec(char input){
		switch(input){
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 5;
		case '(':
			return 6;
		}
		return 0;
	}
	static void infToPost(char[] input){
		Stack<Character> stk = new Stack<Character>();
		int i=0;
		while(i!= input.length){
			if(isOperator(input[i])==0){
				System.out.printf("%c",input[i]);
			}
			else if(isOperator(input[i])==1){
				if(stk.empty() || outPrec(input[i])>inPrec(stk.peek())){
					stk.push(input[i]);
				}
				else{
					while(!stk.empty() && 
					outPrec(input[i])< inPrec(stk.peek())){
						System.out.printf("%c",stk.peek());
						stk.pop();
					}
					stk.push(input[i]);
				}
			}
			else if(input[i]== ')'){
				while(stk.peek()!='('){
					System.out.printf("%c",stk.peek());
					stk.pop();

					if(stk.empty()){
						System.out.printf("Wrong Input\n");
						exit(1);
					}
				}
				stk.pop();

			}
			i++;
		}
		while (!stk.empty()) {
            if (stk.peek() == '(') {
                System.out.printf("\n Wrong input\n");
                exit(1);
            }
            System.out.printf("%c", stk.peek());
            stk.pop();
        }
		
	}
	
	
	public static void main(String args[]){
		char input[] = "K+L-M*N+(O^P)*W/U/V*T+Q^J^A".toCharArray();
		infToPost(input);

	}
}

	