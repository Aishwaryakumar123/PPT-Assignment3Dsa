public class question3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};


    }

    public static void nextPermutation(int[] arr) {
        int indx = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                indx = i;
                break;
            }
        }
        if (indx == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > indx; i--) {
            if (arr[i] > arr[indx]) {
                int temp = arr[indx];
                arr[indx] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        int start = indx + 1;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    public static void reverse ( int[] arr, int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
    }
}
