package easy;

import java.util.*;

class Paren {
    public boolean matching(char a, char b) {
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stk.add(c);
            } else {
                if (stk.isEmpty()) {
                    return false;
                } else if (!matching(stk.peek(), c)) {
                    return false;
                } else {
                    stk.pop();
                }
            }
        }
        return stk.isEmpty();
    }
}

public class valid {
    public static void main(String[] args) {
        Paren sol = new Paren();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (sol.isValid(str))
            System.out.println("Valid Parenthesis");
        else
            System.out.println("Not valid Parenthesis");
    }
}
