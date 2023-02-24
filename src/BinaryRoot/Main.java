package BinaryRoot;

import Tree.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode root =
                new TreeNode (3,
                        new TreeNode (9),
                        new TreeNode (20,
                                new TreeNode (15),
                                new TreeNode(7)));
        System.out.println(TreeNode.maxDepth(root));

    }
}
