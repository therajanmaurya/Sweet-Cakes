import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BalancedBinaryTree {

    public static void main(String[] args) {



    }


    public static boolean isBalanced(BinaryTreeNode treeRoot) {

        // a tree with no nodes is superbalanced, since there are no leaves!
        if (treeRoot == null) {
            return true;
        }

        // we short-circuit as soon as we find more than 2
        List<Integer> depths = new ArrayList<>(3);

        Deque<NodeDepthPair> nodes = new ArrayDeque<>();
        nodes.push(new NodeDepthPair(treeRoot, 0));

        while (!nodes.isEmpty()) {

            // pop a node and its depth from the top of our stack
            NodeDepthPair nodeDepthPair = nodes.pop( );
            BinaryTreeNode node = nodeDepthPair.node;
            int depth = nodeDepthPair.depth;

            // case: we found a leaf
            if (node.left == null && node.right == null) {

                // we only care if it's a new depth
                if (!depths.contains(depth)) {
                    depths.add(depth);

                    // two ways we might now have an unbalanced tree:
                    //   1) more than 2 different leaf depths
                    //   2) 2 leaf depths that are more than 1 apart
                    if (depths.size() > 2 || (depths.size() == 2
                            && Math.abs(depths.get(0) - depths.get(1)) > 1)) {
                        return false;
                    }
                }

                // case: this isn't a leaf - keep stepping down
            } else {
                if (node.left != null) {
                    nodes.push(new NodeDepthPair(node.left, depth + 1));
                }
                if (node.right != null) {
                    nodes.push(new NodeDepthPair(node.right, depth + 1));
                }
            }
        }

        return true;
    }

    private static class NodeDepthPair {

        BinaryTreeNode node;
        int depth;

        NodeDepthPair(BinaryTreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }


    public class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }
}
