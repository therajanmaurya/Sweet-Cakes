package ds

class LinkedList {
    var head: Node? = null

    class Node(var data: Int) {
        var next: Node? = null
    }
}

fun addANodeAtTheFront(newNode: Int) {
    var headNode = LinkedList.Node(1)
    val newNode = LinkedList.Node(newNode)
    newNode.next = headNode
    headNode = newNode // Now update the head node
}

fun insertAfter(prev_node: LinkedList.Node?, new_data: Int) {
    /* 1. Check if the given Node is null */
    if (prev_node == null) {
        println("The given previous node cannot be null")
        return
    }

    /* 2. Allocate the Node &
    3. Put in the data*/
    val new_node = LinkedList.Node(new_data)

    /* 4. Make next of new Node as next of prev_node */
    new_node.next = prev_node.next

    /* 5. make next of prev_node as new_node */
    prev_node.next = new_node
}

fun append(new_data: Int) {
    var head: LinkedList.Node? = LinkedList.Node(1) // just for reference
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
    val new_node = LinkedList.Node(new_data)

    /* 4. If the Linked List is empty, then make the
           new node as head */
    if (head == null) {
        head = LinkedList.Node(new_data)
        return
    }

    /* 4. This new node is going to be the last node, so
         make next of it as null */
    new_node.next = null

    /* 5. Else traverse till the last node */
    var last: LinkedList.Node = head
    while (last.next != null) {
        last = last.next!!
    }

    /* 6. Change the next of last node */
    last.next = new_node
    return
}


