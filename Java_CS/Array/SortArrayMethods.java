package Java_CS.Array;

public class SortArrayMethods {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 5, 9, 18, 15};
        int len = arr.length;
        System.out.println(isArraySortedRecursion(arr, len));
    }

    /*to know if array is sorted till given index using recursion method
        O(n) space complexity, O(n) time complexity*/
    private static boolean isArraySortedRecursion(int[] arr, int index) {
        if(arr.length == 1 || index ==1){
            return true;
        }
        return (arr[index-1] < arr[index-2])?false: isArraySortedRecursion(arr,index-1);
    }


}
