public class MyTernarySearch {
    public static int ternarySearch(int[] array, int data){
        return ternarySearch(array, data, 0, array.length-1);
    }
    public static int ternarySearch(int[] array, int data, int left, int right){
        if (right<left) return -1;//base condition
        int partition=(right-left)/3;
        int mid1=left+partition, mid2=right-partition;

        if(array[mid1]==data) return mid1;
        if(array[mid2]==data) return mid2;

        if(data<array[mid1]){
            return ternarySearch(array, data, left, mid1-1);
        }else if(data>array[mid2]){
            return ternarySearch(array, data, mid2+1, right);
        }else{
            return ternarySearch(array, data, mid1+1, mid2-1);
        }

    }
}
