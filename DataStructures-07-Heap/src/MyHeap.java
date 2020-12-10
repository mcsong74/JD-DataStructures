public class MyHeap {
    private final int [] heap=new int[20];
    private int size;


    private int parent(int index){
        return (index-1)/2;
    }

    private boolean isFull(){
        return size==heap.length;
    }

    public void insert(int value) {
        if (isFull()) throw new IllegalAccessException();

        heap[size++]=value;
        bubbleUp();
    }
    public void bubbleUp(){
        int index=size-1;
        while (index>0 && heap[index]>heap[parent(index)]){
            swap(index, parent(index));
            index=parent(index);
        }
    }
    private void swap(int first, int second){
        var temp=heap[first];
        heap[first]=second;
        heap[second]=temp;
    }
    public void print(){
        for (int i=0; i<size; i++){
            System.out.print(heap[i]+", ");
        }
    }

}
