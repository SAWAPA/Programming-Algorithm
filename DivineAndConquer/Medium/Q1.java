package Medium;

public class Q1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 9, 8, 10};
        
        System.out.println("Arr1 Sorted? : " + isSorted(arr1, 0, arr1.length - 1));
        System.out.println("Arr2 Sorted? : " + isSorted(arr2, 0, arr2.length - 1));
    }

    public static boolean isSorted(int[] arr, int left, int right){
        if(left == right) return true;
        int mid = (left + right) / 2;
        
        boolean leftSorted = isSorted(arr, left, mid);
        boolean rightSorted = isSorted(arr, mid + 1, right);

        if(leftSorted && rightSorted && (arr[mid] <= arr[mid + 1])){
            return true;
        }else{
            return false;
        }
    }
}
