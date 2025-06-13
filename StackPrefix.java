import java.util.Scanner;
import java.util.Stack;
public class StackPrefix{
    public static int prefix(String s){
        Stack<Integer> stk=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                stk.push(ch-'0');
            }else{
                int result=0;
                int a=stk.pop();
                int b=stk.pop();
                switch (ch) {
                    case '+':
result=a+b;
                        break;
                        case '-':
                        result=a-b;
                        break;
                        case '*':
                        result=a*b;
                        break;
                        case '/':
                        result=a/b;
                        break;
                }
                stk.push(result);
            }
        }
        return stk.peek();


    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(prefix(s));

    }
}