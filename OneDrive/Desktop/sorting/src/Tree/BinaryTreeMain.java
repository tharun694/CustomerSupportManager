package Tree;

import java.util.Scanner;

public class BinaryTreeMain {
    static void main() {
//        BinaryTree tree=new BinaryTree();
//        Scanner scan=new Scanner(System.in);
//        tree.insert();
        AVL avl=new AVL();
       int []nums={5,3,6,2,4,1};
 avl.populate(nums);
avl.small();
    }
}
