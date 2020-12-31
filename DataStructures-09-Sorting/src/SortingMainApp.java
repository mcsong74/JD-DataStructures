import java.util.Arrays;

public class SortingMainApp {
    public static void main(String[] args) {
        var myArr=new int[]{8,2,4,-1,1,3,6,3,2,6};

        System.out.println("Bubble sorted\t\t= "+Arrays.toString(MyBubbleSort.bubbleSort(myArr)));

        System.out.println("Selection sorted\t= "+Arrays.toString(MySelectionSort.selectionSort(myArr)));

        System.out.println("Insertion Sorted\t= "+Arrays.toString(MyInsertionSort.insertionSort(myArr)));

        MyMergeSort.mergeSort(myArr);
        System.out.println("Merged Sort\t\t\t= "+Arrays.toString(myArr));

        myArr=new int[]{8,2,4,1,3};
        var quickSort=new MyQuickSort();
        quickSort.sort(myArr);
        System.out.println("Quick Sort\t\t\t= "+Arrays.toString(myArr));

    }
}
