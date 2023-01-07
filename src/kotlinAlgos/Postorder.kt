package kotlinAlgos

import java.util.*

fun main() {

}

fun postOrder(root: Node?): List<Int> {
    val result = java.util.LinkedList<Int>()
    val stack = Stack<Node>()

    if (root == null) return result

    stack.push(root)
    while (stack.isNotEmpty()) {

        val node = stack.pop()
        result.addFirst(node.value)

        node.children.forEach {
            stack.push(it)
        }

    }
    return result

}