import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static String isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stk.isEmpty()) {
                    return "No";
                }
                char top = stk.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return "No";
                }
            }
        }
        return stk.isEmpty() ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(isValid(s[i]));
        }
    }
}