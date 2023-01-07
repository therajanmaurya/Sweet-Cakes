import java.util.HashMap;

public class MiddleOfLinkedList {


    public static void main(String[] args) {

    }

    public static ListNode1 middleNode(ListNode1 head) {
        HashMap<Integer, ListNode1> nodes = new HashMap<>();
        int length = 1;

        nodes.put(length, head);

        while(head.next != null) {
            length += 1;
            nodes.put(length, head.next);
            head = head.next;
        }

        return nodes.get((length/2) + 1);
    }

    public static ListNode1 middleNodeWithOutHashMap(ListNode1 head) {
        ListNode1 slow = head;
        ListNode1 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}
