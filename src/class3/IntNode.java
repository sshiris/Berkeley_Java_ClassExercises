package class3;

public class IntNode {
    public int first;
    public IntNode rest;

    public IntNode(int first, IntNode rest) {
        this.first = first;
        this.rest = rest;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public static void main(String[] args) {
        IntNode L = new IntNode(15, null);
        L = new IntNode(10, L);
        L = new IntNode(5, L);
        System.out.println(L.first);
    }
}
