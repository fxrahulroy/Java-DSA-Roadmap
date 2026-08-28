public class chapter_1 {

    public static void main(String[] args) {

        int[] arr = {7, 2, 9, 1, 5};
        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {

            int root = i;

            while (true) {

                int largest = root;
                int left = 2 * root + 1;
                int right = 2 * root + 2;

                if (left < n && arr[left] > arr[largest]) {
                    largest = left;
                }

                if (right < n && arr[right] > arr[largest]) {
                    largest = right;
                }

                if (largest == root) {
                    break;
                }

                int temp = arr[root];
                arr[root] = arr[largest];
                arr[largest] = temp;

                root = largest;
            }
        }

        // Extract elements from Max Heap
        for (int i = n - 1; i > 0; i--) {

            // Move largest element to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            int root = 0;

            // Heapify remaining elements
            while (true) {

                int largest = root;
                int left = 2 * root + 1;
                int right = 2 * root + 2;

                if (left < i && arr[left] > arr[largest]) {
                    largest = left;
                }

                if (right < i && arr[right] > arr[largest]) {
                    largest = right;
                }

                if (largest == root) {
                    break;
                }

                temp = arr[root];
                arr[root] = arr[largest];
                arr[largest] = temp;

                root = largest;
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}