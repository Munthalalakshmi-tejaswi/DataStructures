

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
        System.out.println(n.data);
    }
    public void insertAtstart(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
    public void insertAt(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node n=head;
        for(int i=0;i<index-1;i++){
            n=n.next;
        }
            node.next=n.next;
             n.next=node;

    }
}
class LinkedAll{
    public static void main(String[] args) {
        Linked list=new Linked();
        list.insert(24);
        list.insert(5);
        list.insert(6);
        list.show();
        list.insertAtstart(3);
        list.show();
        list.insertAt(2, 100);
        list.show();
    }
}
