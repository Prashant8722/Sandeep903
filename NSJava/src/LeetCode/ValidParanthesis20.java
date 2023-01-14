package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis20 {
    public static boolean isValid(String s) {
        Map<Character,Character> mp = new HashMap<>();
        mp.put('}','{');
        mp.put(')','(');
        mp.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(Character bracket : s.toCharArray())
        {
            if(mp.containsKey(bracket))
            {
                char top = stack.isEmpty() ? 'X' :stack.peek();
                if(top !=mp.get(bracket))
                    return false;

                stack.pop();
            } else {
                stack.push(bracket);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//    String s = "()[]{}{]";
        String s = "([]";
    boolean isvalid = isValid(s);
        System.out.println(s + " is a "+ isvalid + " paranthesis.");
    }
}
