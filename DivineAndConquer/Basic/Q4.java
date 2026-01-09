package Basic;

public class Q4 {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 8, 20}; 
        int[] arr2 = {10, 5, -3, 20};
        
        System.out.println("Arr1 All Positive? : " + isAllPositive(arr1, 0, arr1.length - 1));
        System.out.println("Arr2 All Positive? : " + isAllPositive(arr2, 0, arr2.length - 1));
    }

    public static boolean isAllPositive(int[] arr, int left, int right){
        if(left == right){
            if(arr[left] > 0){
                return true;
            }else{
                return false;
            }
        }

        int mid = (left + right) / 2;
        boolean findLeft = isAllPositive(arr, left, mid);
        boolean findRight = isAllPositive(arr, mid + 1, right);

        return findLeft && findRight;
    }
}
