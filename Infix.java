import java.util.Stack;

public class Infix {
    public static int evalinfix(String s) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            } else if (ch == '(') {
                ops.push(ch);
            } else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    int b = val.pop();
                    int a = val.pop();
                    char op = ops.pop();
                    val.push(calculate(a, b, op));
                }
                if (!ops.isEmpty()) ops.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (!ops.isEmpty() && ops.peek() != '(' &&
                        (precedence(ops.peek()) > precedence(ch) ||
                        (precedence(ops.peek()) == precedence(ch) && ch != '^'))) {
                    int b = val.pop();
                    int a = val.pop();
                    char op = ops.pop();
                    val.push(calculate(a, b, op));
                }
                ops.push(ch);
            }
        }

        while (!ops.isEmpty()) {
            int b = val.pop();
            int a = val.pop();
            char op = ops.pop();
            val.push(calculate(a, b, op));
        }

        return val.pop();
    }

    public static int calculate(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            case '^': return (int) Math.pow(a, b);
        }
        return 0;
    }

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return 0;
    }

    public static void main(String[] args) {
        String s = "(8*2)+3-(6^4)/(3+1)";
        System.out.println(evalinfix(s));
    }
}
