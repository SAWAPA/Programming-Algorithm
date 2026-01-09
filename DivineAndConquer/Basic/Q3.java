package Basic;
public class Q3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8};
        int[] arr2 = {2, 4, 7, 8};
        
        System.out.println("Array 1 has odd? : " + hasOdd(arr1, 0, arr1.length - 1));
        System.out.println("Array 2 has odd? : " + hasOdd(arr2, 0, arr2.length - 1));
    }

    public static boolean hasOdd(int[] arr, int left, int right){
        if(left == right){
            if(arr[left] % 2 != 0){
                return true;
            }else{
                return false;
            }
        }

        int mid = (left + right) / 2;

        boolean findLeft = hasOdd(arr, left, mid);
        boolean findRight = hasOdd(arr, mid + 1, right);

        return findLeft || findRight;
    }
}
