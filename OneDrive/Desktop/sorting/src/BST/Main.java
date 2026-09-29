package BST;

public class Main {
    static void main() {
        BST tree=new BST();
        int []nums={1,2,3,4,5,6,7,8,9,10};
       tree.populateSorted(nums);
       tree.display();
    }
}
