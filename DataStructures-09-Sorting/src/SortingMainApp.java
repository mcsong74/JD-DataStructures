import java.util.Arrays;

public class SortingMainApp {
    public static void main(String[] args) {
        var myArr=new int[]{8,2,4,-1,1,3};

        System.out.println("Bubble sorted= "+Arrays.toString(MyBubbleSort.bubbleSort(myArr)));

        System.out.println("Selection sorted = "+Arrays.toString(MySelectionSort.selectionSort(myArr)));

        System.out.println("Insertion Sorted = "+Arrays.toString(MyInsertionSort.insertionSort(myArr)));
    }
}
