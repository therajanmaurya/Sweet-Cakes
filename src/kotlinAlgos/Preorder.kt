package kotlinAlgos

import java.util.Stack

fun main() {

}

fun preOrder(root: Node?): List<Int> {
    val result = ArrayList<Int>()
    val stack = Stack<Node>()

    stack.push(root)
    while (stack.isNotEmpty()) {
        val node = stack.pop()
        result.add(node.value)
        node.children.reversed().forEach {
            stack.push(it)
        }
    }

    return emptyList()
}

class Node(var value: Int) {
    var children: List<Node?> = listOf()
}