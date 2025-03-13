class Node{
    int data;
    Node next;
}
class Linked{
    Node head;
    public void insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
}
class LinkedList{
    public static void main(String[] args) {
        Linked list=new Linked();
        list.insert(5);
        list.insert(8);
        list.insert(9);
        list.show();
    }
}