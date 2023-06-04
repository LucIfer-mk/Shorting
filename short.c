#include <stdio.h>
void swap(int* a, int* b) {
    int t = *a;
    *a = *b;
    *b = t;
}
void quicksort(int arr[], int low, int high) {
    if (low < high) {
        int pivot = arr[high];  
        int i = low - 1;  

        for (int j = low; j <= high - 1; j++) {
            
            if (arr[j] < pivot) {
                i++;  
                swap(&arr[i], &arr[j]);
            }
        }
        swap(&arr[i + 1], &arr[high]);
        quicksort(arr, low, i);
        quicksort(arr, i + 2, high);
    }
}
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
int main() {
    int arr[] = {9, 5, 1, 8, 2, 7, 3};
    int size = sizeof(arr) / sizeof(arr[0]);
    printf("Original array: ");
    printArray(arr, size);
    quicksort(arr, 0, size - 1);
    printf("Sorted array: ");
    printArray(arr, size);
    return 0;
}
