public class Q2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 2, 10, 2, 2, 3};
        int target = 2;
        
        int count = countTarget(arr, 0, arr.length - 1, target);
        System.out.println("Found " + target + " : " + count + " times.");
    }

    public static int countTarget(int[] arr, int left, int right, int target){
        if(left == right){
            if(arr[left] == target){
                return 1;
            }else{
                return 0;
            }
        }

        int mid = (left + right) / 2;
        int findLeft = countTarget(arr, left, mid, target);
        int findRight = countTarget(arr, mid + 1, right, target);
        return findLeft + findRight;
    }
}
