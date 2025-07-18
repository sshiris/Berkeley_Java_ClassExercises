package class3;

public class AList {
    private int[] data;
    private int size;
    //Creates an empty list
    public AList(){
        data = new int[100];
        size = 0;
    }

    //Inserts X into the back of the list.
    public void addLast(int x){
        data[size] = x;
        size += 1;
    }

    //returns the item from the back of the list
    public int getLast(){
        return data[size-1];
    }

    // gets the ith item in the list(0 is the front)
    public int get(int i){
        return data[i];
    }

    //returns the number of items in the list
    public int size(){
        return size;
    }
}
