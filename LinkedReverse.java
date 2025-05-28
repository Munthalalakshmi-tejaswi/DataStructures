class LinkedReverse{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node current=head;
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public static void printli(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main (String[] args) {
        Node head=new Node(8);
        head.next=new Node(7);
        head.next.next=new Node(6);
        printli(head);
        head=reverse(head);
        printli(head);
    }
}