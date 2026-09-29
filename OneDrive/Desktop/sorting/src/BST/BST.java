package BST;

public class BST {
    static class Node {
        int val;
        Node left;
        Node right;
        int height;

        Node(int val) {
            this.val = val;
        }
        Node(){

        }
        int getVal(){
            return val;
        }
    }
private Node root;
    int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    boolean isEmpty(){
        return  root==null;
    }
    void populate(int []nums){
        for (int i = 0; i < nums.length; i++) {
this.insert(nums[i]);
        }
    }

    void populateSorted(int []nums){
        SortedArrayTree(nums,0, nums.length);
    }
    public  void SortedArrayTree(int []nums, int s, int e){
        if(s>=e) return;
        int mid=(s+e)/2;
        this.insert(nums[mid]);
        SortedArrayTree(nums,s,mid);
        SortedArrayTree(nums,mid+1,e);
    }

    void insert(int val){
 root=insert(val,root);
    }
    Node insert(int val,Node node){
if(node==null){
    node=new Node(val);
    return node;
}
if(val<node.val){
    node.left=insert(val,node.left);
}
if(val>node.val){
    node.right=insert(val,node.right);
}
node.height=Math.max(height(node.left),height(node.right))+1;
return node;
    }

    boolean balanced(){
      return   balanced(root);
    }

    private  boolean balanced(Node node){
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left)&&balanced(node.right);
    }

    void display(){
        display(this.root," Root Node: ");
    }

    void display(Node node,String details){
        if(node==null)return;

        System.out.println(node.val+ details);
        display(node.left," Left child of  "+node.val+" : ");
        display(node.right," right chid of  "+node.val+ " : ");
    }
    void preoder(){
        PreOder(root);
    }

    private void PreOder(Node node) {
        if(node==null)return;
        System.out.println(node.val+" ");
        PreOder(node.left);
        PreOder(node.right);
    }
    void inoder(){
        PreOder(root);
    }

    private void InOder(Node node) {
        if(node==null)return;
        PreOder(node.left);
        System.out.println(node.val+" ");
        PreOder(node.right);
    }
    void postoder(){
        PreOder(root);
    }

    private void PostOder(Node node) {
        if(node==null)return;
        PreOder(node.left);
        PreOder(node.right);
        System.out.println(node.val+" ");

    }

}
