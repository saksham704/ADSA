public class Array {
    public static void main(String[] args) {
        int arr1[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(BinarySearch(arr1, target, 0, arr1.length - 1));
    }

    static int BinarySearch(int arr[], int target, int s, int e) {
        if (s > e) { 
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return BinarySearch(arr, target, s, mid - 1);
            } else {
                return BinarySearch(arr, target, mid + 1, e);
            }
        }
        if (target >= arr[mid] && target <= arr[e]) {
            return BinarySearch(arr, target, mid + 1, e);
        }
        return BinarySearch(arr, target, s, mid - 1); 
    }
}
