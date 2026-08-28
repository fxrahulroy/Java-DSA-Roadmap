public class Main {

    public static void main(String[] args) {
//  Basic method
        int[] arr = {7, 2, 9, 1, 5};
        int n = arr.length;

        // size = 1, 2, 4, 8...
        for (int size = 1; size < n; size = size * 2) {

            for (int left = 0; left < n - 1; left = left + 2 * size) {

                int mid = Math.min(left + size - 1, n - 1);
                int right = Math.min(left + 2 * size - 1, n - 1);

                int n1 = mid - left + 1;
                int n2 = right - mid;

                int[] leftArr = new int[n1];
                int[] rightArr = new int[n2];

                // Copy left part
                for (int i = 0; i < n1; i++) {
                    leftArr[i] = arr[left + i];
                }

                // Copy right part
                for (int i = 0; i < n2; i++) {
                    rightArr[i] = arr[mid + 1 + i];
                }

                int i = 0;
                int j = 0;
                int k = left;

                // Merge
                while (i < n1 && j < n2) {

                    if (leftArr[i] <= rightArr[j]) {
                        arr[k] = leftArr[i];
                        i++;
                    } else {
                        arr[k] = rightArr[j];
                        j++;
                    }

                    k++;
                }

                // Remaining left
                while (i < n1) {
                    arr[k] = leftArr[i];
                    i++;
                    k++;
                }

                // Remaining right
                while (j < n2) {
                    arr[k] = rightArr[j];
                    j++;
                    k++;
                }
            }
        }

        // Print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}