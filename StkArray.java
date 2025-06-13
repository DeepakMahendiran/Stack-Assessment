import java.util.Scanner;
class stack{
int top=-1;
int [] arr=new int[5];
public void push(int data){
    if(top==arr.length-1){
       System.out.println("stack is full");
    }else{
        top++;
        arr[top]=data;
    }
}
public void pop(){
    if(top==-1){
        System.out.println("stack is empty");
    }
    else{
        int temp=top;
        top--;
        System.out.println("popped element is "+temp);
        temp=0;
    }
}


public void display(){
    if(top==-1){
        System.out.println("The stack is empty");
    }
    for(int i=0;i<=top;i++){
    System.out.print(arr[i]+"  ");
}
}

}

public class StkArray
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    stack s=new stack();
	    while(true){
	        System.out.println("1.push");
	         System.out.println("2.pop");
	          System.out.println("3.display");
	           System.out.println("4.Any other choice:exit");
	           System.out.println("enter your choice");
	           int n=sc.nextInt();
	           if(n==4){
System.out.println("exit..");
	               break;
	           }
	           switch(n){
	               case 1:
	                   System.out.println("enter the element to be pushed");
	                   int p=sc.nextInt();
	                   s.push(p);
	                   break;
	                   case 2:
	                       s.pop();
	                       break;
	                       case 3:
	                           System.out.println("The content of the stack are");
	                           s.display();
	                           break;
default:
System.out.println("enter valid choice");
break;


	                           
	           }
	        
	    }
		
	}
}