package DataStructures.LinkedList.Doubly;

class Node1 {
    char data;
    Node1 next, prev;

    Node1(char d) {
        data = d;
        next = prev = null;
    }
}
class Question1 {
    Node1 head;
}
class DoublyLinkedList {

    Node1 head;

    void insert(char data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node1 temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    void rotate(int n) {

        Node1 temp = head;

        for (int i = 1; i < n; i++)
            temp = temp.next;

        Node1 newHead = temp.next;
        temp.next = null;
        newHead.prev = null;

        Node1 tail = newHead;
        while (tail.next != null)
            tail = tail.next;

        tail.next = head;
        head.prev = tail;

        head = newHead;
    }

    void print() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class Drive{

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insert('a');
        dll.insert('b');
        dll.insert('c');
        dll.insert('d');
        dll.insert('e');
        dll.insert('f');

        System.out.println("Original List:");
        dll.print();

        dll.rotate(3);

        System.out.println("After Rotation:");
        dll.print();
    }
}