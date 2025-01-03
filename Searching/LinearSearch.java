class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 7, 5, 9 };
        int target = 5;
        int result = LinearSearch(arr, target);
        
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found:");

    }

    public static int LinearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;

    }
}