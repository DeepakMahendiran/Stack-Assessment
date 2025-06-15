import java.util.Stack;
public class Infixtopostfix {

    public static String infixtopostfix(String s){
        Stack <Character> ops=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                res.append(ch);
            }
            else if(ch=='('){
                ops.push(ch);
            }
            else if(ch==')' ){
                while(!ops.isEmpty() && ops.peek()!='('){ // fixed: added !ops.isEmpty()
                    char op=ops.pop();
                    res.append(op);
                }
                if(!ops.isEmpty()) ops.pop(); // fixed: safe pop
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'){
                while(!ops.isEmpty()&& ops.peek()!='('
                && ((precedence(ops.peek())>(precedence(ch)))||
                (precedence(ops.peek())==(precedence(ch)) && ops.peek()!='^'))){ // fixed parentheses
                    char op=ops.pop();
                    res.append(op);
                }
                ops.push(ch); // push operator
            }
        }
        while(!ops.isEmpty()){
            char op=ops.pop();
            res.append(op);
        }
        return res.toString();
    }

    public static int precedence(char ch){
        if(ch=='+'||ch=='-') return 1;
        if(ch=='*'||ch=='/') return 2;
        if(ch=='^') return 3;
        return 0;
    }

    public static void main(String[] args){
        String s="A+(b*c)/d";
        System.out.println(infixtopostfix(s));
    }
}
