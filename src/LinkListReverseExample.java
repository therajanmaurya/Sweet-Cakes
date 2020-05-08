import javax.swing.*;

public class LinkListReverseExample {

    public class LinkListNode {
        public int value;
        public LinkListNode next;

        public LinkListNode(int value) {
            this.value = value;
        }
    }

    public LinkListNode reverseLinkList(LinkListNode headList) {
        LinkListNode currentNode = headList;
        LinkListNode previousNode = null;
        LinkListNode nextNode = null;

        while (currentNode != null) {

            nextNode = currentNode.next;
            currentNode.next = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }
}
