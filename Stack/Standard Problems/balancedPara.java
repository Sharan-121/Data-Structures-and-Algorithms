import java.util.*;

class Solution {
    boolean checkBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char check;
                switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
                }
            }

        }
        return (stack.isEmpty());
    }
}

class balancedPara {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String exp = "([{}]])";
        System.out.println(obj.checkBalanced(exp));
    }
}