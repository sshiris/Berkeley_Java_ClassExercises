package class3;

public class DLList {
    public static void main(String[] args) {

    }

    public class Node {
        public Node prev;
        public int item;
        public Node next;

        public Node(int item) {
            this.item = item;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    public int size;

    public void addFirst(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size += 1;
    }

    public void addLast(int data){
        Node temp = new Node(data);
        if (tail == null) {
            head = temp;
            tail = temp;
        } else {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        size += 1;
    }

    public static void main()
}
