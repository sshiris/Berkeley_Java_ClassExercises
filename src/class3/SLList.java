package class3;

public class SLList {
    public IntNode sentinel;
    public int size;

    public class IntNode {
        public int first;
        public IntNode rest;

        public IntNode(int first, IntNode rest) {
            this.first = first;
            this.rest = rest;
        }
    }

    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.rest = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.rest = new IntNode(x, sentinel.rest);
        size += 1;
    }

    public int getFirst() {
        return sentinel.rest.first;
    }

    // private static int size(IntNode p) {
    // if (p.rest == null) {
    // return 1;
    // }
    // return 1 + size(p.rest);
    // }

    // public int size() {
    // return size(first);
    // }

    public void addLast(int x) {
        size += 1;
        IntNode p = sentinel;

        while (p.rest != null) {
            p = p.rest;
        }

        p.rest = new IntNode(x, null);
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        // L.addFirst(10);
        // L.addFirst(5);
        L.addLast(25);
        System.out.println(L.size);
    }
}
