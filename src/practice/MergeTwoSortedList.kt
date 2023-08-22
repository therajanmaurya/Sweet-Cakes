package practice

fun main() {

}


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoSortedList(list1: ListNode?, list2: ListNode?): ListNode? {

    if (list1 == null) return list2
    if (list2 == null) return list1

    var l1 = list1
    var l2 = list2
    var node = ListNode(-1)
    val head = node

    while (l1 != null && l2 != null) {

        if (l1.`val` < l2.`val`) {
            node?.next = l1
            l1 = l1.next
        } else {
            node?.next = l2
            l2 = l2.next
        }
        node = node.next!!
    }

    node.next = l1 ?: l2

    return head.next
}