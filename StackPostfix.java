import java.util.Scanner;
import java.util.Stack;


public class StackPostfix
{
    public static int val(String s){
        Stack <Integer>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                stk.push(ch-'0');
            }
            else{
                int b=stk.pop();
                int a=stk.pop();
                int result=0;
                switch(ch){
                    case '+':result=a+b;break;
                    case '-':result=a-b;break;
                    case '*':result=a*b;break;
                    case '/':result=a/b;break;

                }
                stk.push(result);
            }
        }
        return stk.peek();
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(val(s));
	}
}