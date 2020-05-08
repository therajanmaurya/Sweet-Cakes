public class DeleteNode {

    public static void main(String[] args) {
        LinkedListNode a = new LinkedListNode(1);
        LinkedListNode b = new LinkedListNode(2);
        LinkedListNode c = new LinkedListNode(3);
        a.next = b;
        b.next = c;
        deleteNode(b);
    }

    public static void deleteNode(LinkedListNode nodeToDelete) {
        LinkedListNode next = nodeToDelete.next;
        if (next != null) {
            nodeToDelete.next = next.next;
            nodeToDelete.value = next.value;
        } else {
            throw new IllegalArgumentException("Can't delete the last node with this technique!");
        }
        System.out.println(nodeToDelete.value);
    }

    public static class LinkedListNode {
        public int value;
        public LinkedListNode next;
        public LinkedListNode(int value) {
            this.value = value;
        }
    }
}
