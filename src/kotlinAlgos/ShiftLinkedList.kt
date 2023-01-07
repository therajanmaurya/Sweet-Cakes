package kotlinAlgos


fun main() {

}

fun push(new_data: Int, head: LinkedList): LinkedList {
    val new_node = LinkedList(new_data)
    new_node.next = head
    return new_node
}

open class LinkedList(value: Int) {
    var value = value
    var next: LinkedList? = null
}

fun shiftLinkedList(head: LinkedList, k: Int): LinkedList {
    // Write your code here.
    if (head.next == null || k == 0) return head

    var backPointer: LinkedList = head
    var currHead: LinkedList? = head
    var count = 0
    while (head.next != null) {
        if (count == k) {
            backPointer = backPointer.next!!
            count = -1
        } else if (count == -1) {
            backPointer = backPointer.next!!
        }
        if (count != -1) ++count
        currHead = head.next
    }

    val newHead = backPointer.next
    backPointer.next = null
    currHead?.next = head

    return newHead!!
}
