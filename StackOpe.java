class StackOpe{
    public static void main(String[] args){
        Stack nums=new Stack();
        nums.push(3);
        nums.push(5);
        nums.push(8);
        nums.push(7);
        System.out.println(nums.size());
        nums.show();
        System.out.println(nums.pop());
        System.out.println(nums.size());
        
        nums.show();
        System.out.println(nums.peek());
        nums.pop();
        nums.pop();
        nums.pop();
        
        nums.show();
        System.out.println(nums.pop());
        nums.push(100);
        nums.show();
    }
}
class Stack{
    int[] stack=new int[5];
    int top=0;
    public void push(int data){
        if(top==4){
        System.out.println("Stack is Full");
        }
        else{
        stack[top]=data;
        top++;
        }
    }
    public void show(){
        for(int n:stack){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public int pop(){
        int data;
        if(isEmpty())
        System.out.println("Stack is Empty");
        
        else
        top--;
        data=stack[top];
        stack[top]=0;
        
        return data;
        
    }
    public int size(){
        return top;
    }
    public int peek(){
        int data;
        data=stack[top-1];
        stack[top]=0;
        return data;
    }
    public boolean  isEmpty(){
     return top<=0;
    }
}