import java.util.*;
 
public class Main {
	 
    private static boolean isExpressionBalanced(String expr)
    {
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < expr.length(); i++) {
        	
            char x = expr.charAt(i);
            
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else {
            	
            	if (stack.isEmpty())
                    return false;
            	
                char check = stack.pop();
                switch (x) {
	                case ')':
	                    if (check != '(')
	                        return false;
	                    break;
	     
	                case '}':
	                    if (check != '{')
	                        return false;
	                    break;
	     
	                case ']':
	                    if (check != '[')
	                        return false;
	                    break;
                }
            }
        }
        
        return stack.isEmpty();
    }
 
    public static void main(String[] args)
    {
    	// choose your own expression
        String expr = "([{}]){[]}";
 
        if (isExpressionBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}