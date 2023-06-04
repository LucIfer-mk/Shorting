import java.util.Arrays;

public class Quicksort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex - 1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; 
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 2, 7, 3};
        System.out.println("Original array:");
        printArray(arr);
        quicksort(arr, 0, arr.length - 1)
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
