import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// Leetcode 993. Cousins in Binary Tree

/**
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 * <p>
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 * <p>
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 * <p>
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 * <p>
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * <p>
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 * <p>
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 */

class CousinsInBinaryTree {

    public static void main(String[] args) {
        /*
         * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
         * Output: true
         * */

        TreeNode node = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(4, null, null)),
                new TreeNode(3, null, new TreeNode(5, null, null)));

        System.out.println(isCousins(node, 5, 4));
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        HashMap<Integer, TreeDepth> map = new HashMap();

        Queue<TreeDepth> node = new LinkedList();
        node.offer(new TreeDepth(root, 0));

        while (!node.isEmpty()) {
            TreeDepth treeDepth = node.poll();
            TreeNode tree = treeDepth.tree;
            int depth = treeDepth.depth;

            if (tree.left != null) {
                node.offer(new TreeDepth(tree.left, depth + 1));
                if (tree.left.val == x) {
                    map.put(x, new TreeDepth(tree, depth + 1));
                }

                if (tree.left.val == y) {
                    map.put(y, new TreeDepth(tree, depth + 1));
                }
            }

            if (tree.right != null) {
                node.offer(new TreeDepth(tree.right, depth + 1));
                if (tree.right.val == x) {
                    map.put(x, new TreeDepth(tree, depth + 1));
                }

                if (tree.right.val == y) {
                    map.put(y, new TreeDepth(tree, depth + 1));
                }
            }
        }

        TreeDepth depthX = map.get(x);
        TreeDepth depthY = map.get(y);
        if (depthX != null && depthY != null && depthX.tree.val != depthY.tree.val && depthX.depth == depthY.depth) {
            return true;
        } else {
            return false;
        }
    }
}

class TreeDepth {
    TreeNode tree;
    int depth;

    TreeDepth(TreeNode node, int depth) {
        this.tree = node;
        this.depth = depth;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
