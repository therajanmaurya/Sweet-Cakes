package kotlinAlgos

import java.util.*


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class InorderTraversal {

    fun inorderTraversal(root: TreeNode?): List<Int> {
        var root = root
        val result: MutableList<Int> = ArrayList<Int>()
        val stk = Stack<TreeNode>()
        while (!stk.isEmpty() || root != null) {
            while (root != null) {
                stk.push(root)
                root = root.left
            }
            val poppedNode = stk.pop()
            result.add(poppedNode.`val`)
            root = poppedNode.right
        }
        return result
    }
}