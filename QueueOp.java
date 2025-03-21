class QueueOp{
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(8);
        q.enqueue(7);
        q.show();
        q.dequeue();
        q.show();
    }
}
class Queue{
    int[] queue=new int[5];
    int front,rear,size;
    public void enqueue(int data){
        queue[rear]=data;
        rear++;
        size++;
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[front+i]+" ");
        }
        System.out.println("");
    }
    
    public int dequeue(){
        int data=queue[front];
        front++;
        size--;
        return data;
    }
}