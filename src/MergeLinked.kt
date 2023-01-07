class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        var l1 = list1
        var l2 = list2

        if (l1.`val` > l2.`val`) {
            var temp = l1
            l1 = l2
            l2 = temp
        }

        val head: ListNode = list1
        while (l1 != null || l2 != null) {
            var curr: ListNode? = null
            while (l1 != null && l2 != null && l1.`val` <= l2.`val`) {
                curr = l1
                l1 = l1.next
            }
            curr?.next = list2
            var temp: ListNode? = l1
            l1 = l2
            l2 = temp
        }
        return head
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}