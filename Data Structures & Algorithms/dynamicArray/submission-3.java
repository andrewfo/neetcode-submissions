class DynamicArray {

    private int [] con;
    private int size;

    public DynamicArray(int capacity) {
        if(capacity > 0){
            con = new int[capacity];  
        }
    }

    public int get(int i) {
        return con[i];
    }

    public void set(int i, int n) {
        con[i] = n;
    }

    public void pushback(int n) {
        if(size == con.length){
            resize();
        }
        con[size] = n;
        size++;
    }

    public int popback() {
        int temp = con[size - 1];
        size--;
        return temp;
    }

    public void resize() {
        int[] newc = new int[con.length * 2];
        for(int i = 0; i < con.length; i++){
            newc[i] = con[i];
        }
        con = newc;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return con.length;
    }
}