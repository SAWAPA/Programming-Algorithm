package Medium;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 30;
        
        System.out.println("Index of " + target + " is: " + search(arr, 0, arr.length - 1, target));
    }

    public static int search(int[] arr, int left, int right, int target){
        if(left > right) return -1;
        int mid = (left + right) / 2;

        if(arr[mid] == target) return mid;
        if(target < arr[mid]){
            return search(arr, left, mid - 1, target);
        }else{
            return search(arr, mid + 1, right, target);
        }
    }
}
