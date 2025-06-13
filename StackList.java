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
        node temp=top;
        top=top.next;
        temp=null;
    }
    public void peek(){
        node temp=top;
        System.out.println("peek"+temp.data);
    }
    public void display(){
        node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
   
}

public class StackList
{
	public static void main(String[] args) {
		stack s=new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.peek();
		s.push(40);
		s.display();
	}
}