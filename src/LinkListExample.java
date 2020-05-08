import java.util.LinkedList;

public class LinkListExample {



    public class LinkedListNode {

        public int value;
        public LinkedListNode next;

        public LinkedListNode(int value) {
            this.value = value;
        }
    }

    public static LinkedListNode getIthItemInLinkedList(LinkedListNode head, int i) {

        if (i < 0) {
            throw new IllegalArgumentException(String.format("i can't be negative: %d", i));
        }

        LinkedListNode currentNode = head;
        int currentPosition = 0;

        while (currentNode != null) {

            if (currentPosition == i) {
                // found it!
                return currentNode;
            }

            // move on to the next node
            currentNode = currentNode.next;
            currentPosition++;
        }

        throw new IllegalArgumentException(String.format("List has fewer than i + 1 (%d) nodes", i + 1));
    }

}
