public class Q1 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 3, 30, 10};
        System.out.println("Max = " + maxInt(arr, 0, arr.length - 1));
    }

    public static int maxInt(int[] arr, int left, int right){
        if(left == right){
            if(arr[left] >= arr[right]) return arr[left];
            if (arr[right] >= arr[left]) return arr[right];
            if(arr[left] == arr[right]) return arr[left];
        }

        int mid = (left + right) / 2;
        int maxLeft = maxInt(arr, left, mid);
        int maxRight = maxInt(arr, mid + 1, right);

        if(maxLeft >= maxRight){
            return maxLeft;
        }else if(maxRight >= maxLeft){
            return maxRight;
        }else{
            return maxLeft;
        }
    }

}
