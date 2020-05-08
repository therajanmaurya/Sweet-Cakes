import java.util.HashMap;

public class MiddleOfLinkedList {


    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        HashMap<Integer, ListNode> nodes = new HashMap<>();
        int length = 1;

        nodes.put(length, head);

        while(head.next != null) {
            length += 1;
            nodes.put(length, head.next);
            head = head.next;
        }

        return nodes.get((length/2) + 1);
    }

    public static ListNode middleNodeWithOutHashMap(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
