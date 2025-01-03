public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 4;

        int result = binarySearchRecursive(arr, target, 0, arr.length - 1);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found:");
    }

    public static int binarySearchRecursive(int arr[], int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] > target) {
                return binarySearchRecursive(arr, target, left, mid - 1);
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, right);
            } else
                return mid;
        }
        return -1;
    }

}
