package Tree;


public class AVL {

    static void main() {
        AVL tree=new AVL();
        int []nums={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i< nums.length;i++){
            tree.populateSorted(nums);
        }
        tree.display();
    }
  public   class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        int height;

        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(){

        }
        int getVal(){
            return val;
        }
    }
    private TreeNode root;

    public AVL(){

    }
    int height(){
        return height(root);
    }
    int height(TreeNode treeNode){
        if(treeNode ==null){
            return -1;
        }
        return treeNode.height;
    }
    boolean isEmpty(){
        return  root==null;
    }

    void insert(int val){
        root=insert(val,root);
    }
  TreeNode insert(int val, TreeNode treeNode){
        if(treeNode == null){
            treeNode = new TreeNode(val);
            return treeNode;
        }
        if(val < treeNode.val){
            treeNode.left=insert(val, treeNode.left);
        }
        if(val> treeNode.val){
            treeNode.right=insert(val, treeNode.right);
        }
        treeNode.height=Math.max(height(treeNode.left),height(treeNode.right))+1;
        return rotate(treeNode);
    }

    TreeNode rotate(TreeNode treeNode){
        if(height(treeNode.left)-height(treeNode.right)>1){
//left heavy
            if(height(treeNode.left.left)-height(treeNode.left.right)>0){
                // left left case
                return rightRotate(treeNode);
                }
            if(height(treeNode.left.left)-height(treeNode.left.right)<0){
                //left right case
                treeNode.left=leftRotate(treeNode.left);
                return rightRotate(treeNode);
            }
        }



        if(height(treeNode.left)-height(treeNode.right)<-1){
            //right heavy
            if(height(treeNode.right.left)-height(treeNode.right.right)<0){
                // right right case
                 return leftRotate(treeNode);
            }
            if(height(treeNode.right.left)-height(treeNode.right.right)>0){
                //left right case
                treeNode.right=rightRotate(treeNode.right);
                return leftRotate(treeNode);
            }
        }
        return treeNode;
    }

    private TreeNode rightRotate(TreeNode p) {
TreeNode c=p.left;
TreeNode t=c.right;
c.right=p;
p.left=t;
p.height=Math.max(height(p.left),height(p.right)+1);
c.height=Math.max(height(c.left),height(c.left)+1);
return c;
    }

    private TreeNode leftRotate(TreeNode c) {
TreeNode p=c.right;
TreeNode t=p.left;
p.left=c;
c.right=t;
        p.height=Math.max(height(p.left),height(p.right)+1);
c.height=Math.max(height(c.left),height(c.right)+1);
return p;
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
    boolean balanced(){
        return   balanced(root);
    }

    private  boolean balanced(TreeNode treeNode){
        if(treeNode ==null){
            return true;
        }
        return Math.abs(height(treeNode.left)-height(treeNode.right))<=1 && balanced(treeNode.left)&&balanced(treeNode.right);
    }

    void display(){
        display(this.root," Root Node: ");
    }

    void display(TreeNode treeNode, String details){
        if(treeNode ==null)return;

        System.out.println(treeNode.val+ details);
        display(treeNode.left," Left child of  "+ treeNode.val+" : ");
        display(treeNode.right," right chid of  "+ treeNode.val+ " : ");
    }

void small(){
        kthSmallest(this.root,3);
}
    public int kthSmallest(TreeNode root, int k) {
        TreeNode ans= kSmall(root,k,0);
        return ans.val;
    }

   static TreeNode kSmall(TreeNode root,int k,int count){
        if(root==null)return root;
        TreeNode left= kSmall(root.left,k,count);
        if(left==null){
            count+=1;
            if(count==k)return root;
        }else{
            return left;
        }

        TreeNode right= kSmall(root.right,k,count);
        return right!=null?right:left;
    }
    void preoder(){
        PreOder(root);
    }

    private void PreOder(TreeNode treeNode) {
        if(treeNode ==null)return;
        System.out.println(treeNode.val+" ");
        PreOder(treeNode.left);
        PreOder(treeNode.right);
    }
    void inoder(){
        PreOder(root);
    }

    private void InOder(TreeNode treeNode) {
        if(treeNode ==null)return;
        PreOder(treeNode.left);
        System.out.println(treeNode.val+" ");
        PreOder(treeNode.right);
    }
    void postoder(){
        PreOder(root);
    }

    private void PostOder(TreeNode treeNode) {
        if(treeNode ==null)return;
        PreOder(treeNode.left);
        PreOder(treeNode.right);
        System.out.println(treeNode.val+" ");

    }

}
