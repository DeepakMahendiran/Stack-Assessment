class stack{
int top=-1;
int [] arr=new int[5];
public void push(int data){
    if(top==arr.length-1){
        resize();
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
        temp=0;
    }
}
public void peek(){

    System.out.println(arr[top]);
}

public void display(){
    for(int i=0;i<=top;i++){
    System.out.println(arr[i]);
}
}
public void resize(){
    int []t=new int[arr.length*2];
    for(int i=0;i<=top;i++){
        t[i]=arr[i];
    }
    arr=t;
}

}

public class StackStatic
{
	public static void main(String[] args) {
	    stack s=new stack();
	    s.push(10);
	    s.push(20);
	    s.push(30);
	    s.display();
	    s.peek();
	    s.pop();
	    s.display();
	    s.push(190);
	    s.push(36);
	    s.push(153);
	    s.display();
	    s.push(42);
	    s.push(9900);
	    s.push(7889);
	    s.display();
		
	}
}