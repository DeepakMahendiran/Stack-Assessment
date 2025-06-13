import java.util.Scanner;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
class stack{
    node top=null;
    public void push(int data){
        node n=new node(data);
        n.next=top;
        top=n;
    }
    public void pop(){
        if(top==null){
            System.out.println("{}");
        }
        node temp=top;
        System.out.println("element popped is "+temp.data);
        top=top.next;
        temp=null;
    }
    public void display(){
        if(top==null){
            System.out.println("{}");
        }
        else{
        node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    }
    public void count(){
        node temp=top;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        System.out.println("number of elements in the linked list is"+c);
    }
    
}

public class StackCount
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    stack s=new stack();
	    while(true){
	        System.out.println("Choice 1 : To push data");
	         System.out.println("Choice 2 : To pop data");
	          System.out.println("Choice 3 : To display data");
	           System.out.println("Choice 4 : To count data");
	           System.out.println("enter your choice");
	           int a=sc.nextInt();
	           if(a>4){
System.out.println("enter valid choice");
	               break;
	           }
	           switch(a){
	               case 1:
	                   System.out.println("Enter the data to be pushed");
	                   int p=sc.nextInt();
	                   s.push(p);
	                   break;
	                   case 2:
	                       s.pop();
	                       break;
	                       case 3:
	                           System.out.println("Stack contents are");
	                           s.display();
	                           break;
	                           case 4:
	                               s.count();
	                               break;
	                           
	           }
	        
	    }
		
	}
}