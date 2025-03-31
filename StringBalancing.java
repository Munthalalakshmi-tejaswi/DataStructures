import java.util.*;
class StringBalancing{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            boolean isBalanced = isBalancedString(input);
            System.out.println(isBalanced);
        }
    }

    private static boolean isBalancedString(String line) 
    {
        Stack<Character> stack = new Stack<>();
        
        for (char c : line.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

	}
		
}