class QueueAllop{
    public static void main(String[] args) {
        Queue q=new Queue();
        System.out.println(q.isEmpty());
        q.enqueue(100);
        q.enqueue(55);
        q.enqueue(66);
        q.show();
        System.out.println(q.getSize());
        q.dequeue();
        q.show();

    }
}
class Queue{
    int[] queue=new int[5];
    int rear,front,size;
    public void enqueue(int data){
        if(!isFull()){
        queue[rear]=data;
        rear++;
        size++;
        }
        else{
            System.out.println("Queue is full");
        }
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[front+i]+" ");
        }
        System.out.println("");
    }
    public int dequeue(){
        int data=queue[front];
        if(!isEmpty()){
        front++;
        size--;
       
        }
        else{
            System.out.println("Queue is Empty");
        }
        return data;
    }
    public int getSize(){
     return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==5;
    }
}