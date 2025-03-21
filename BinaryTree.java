

class BinaryTree{
    public static void main(String[] args) {
        Binary bt=new Binary();
        bt.insert(3);
        bt.insert(8);
        bt.insert(55);
        bt.insert(6);
        bt.insert(81);
        bt.insert(4);
        bt.inOrder();
    }
}
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
    }
}
class Binary{
    Node root;
    public void insert(int data){
        root=insertRec(root,data);
    }
    public Node insertRec(Node root,int data){
        if(root==null)
            root=new Node(data);
        
        else if(data<root.data)
        root.left=insertRec(root.left,data);
        else if(data>root.data)
        root.right=insertRec(root.right,data);
        return root;
    }
    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(Node root){
        if(root!=null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }
}
