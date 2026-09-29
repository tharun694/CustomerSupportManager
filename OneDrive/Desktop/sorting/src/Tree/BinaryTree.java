package Tree;

import java.util.*;

public class BinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode() {

        }
    }

    private TreeNode root;

    public void insert() {
        System.out.println(" Enter the root node");
        Scanner scan = new Scanner(System.in);

        int val = scan.nextInt();
        root = new TreeNode(val);
        populate(scan, root);
//        rightSideView(root);
        isSymmetric(root);
        // prettyDisplay(root, 0);
    }

    void populate(Scanner scan, TreeNode treeNode) {
        System.out.println(" Do you want insert the left  of ? " + treeNode.val);
        boolean left = scan.nextBoolean();
        if (left) {
            System.out.println(" Do you want insert the left value of ? " + treeNode.val);
            int value = scan.nextInt();
            treeNode.left = new TreeNode(value);
            populate(scan, treeNode.left);
        }

        System.out.println(" Do you want insert the right  of ? " + treeNode.val);
        boolean right = scan.nextBoolean();
        if (right) {
            System.out.println("Do you want insert the right value of ? " + treeNode.val);
            int value = scan.nextInt();
            treeNode.right = new TreeNode(value);
            populate(scan, treeNode.right);
        }

    }

    public void display() {
        display(root, " ");
    }

    public void display(TreeNode treeNode, String indent) {
        if (treeNode == null) {
            return;
        }
        System.out.println(indent + treeNode.val);
        display(treeNode.left, indent + "\t");
        display(treeNode.right, indent + "\t");
    }

    public void prettyDisplay(TreeNode treeNode, int level) {
        if (treeNode == null) {
            return;
        }
        prettyDisplay(treeNode.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + treeNode.val);

        } else {
            System.out.println(treeNode.val);
        }
        prettyDisplay(treeNode.left, level + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currentnode = queue.poll();
                if (i == size - 1) list.add(currentnode.val);
                if (currentnode.left != null) {
                    queue.offer(currentnode.left);
                }
                if (currentnode.right != null) {
                    queue.offer(currentnode.right);
                }
            }
        }
        return list;
    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
}
