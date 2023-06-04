function swap(arr, i, j) {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
function quicksort(arr, low, high) {
    if (low < high) {
        const pivotIndex = partition(arr, low, high);
        quicksort(arr, low, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, high);
    }
}
function partition(arr, low, high) {
    const pivot = arr[high]; 
    let i = low - 1; 
    for (let j = low; j <= high - 1; j++) {
        
        if (arr[j] < pivot) {
            i++; 
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return i + 1;
}
function printArray(arr) {
    console.log(arr.join(' '));
}
function main() {
    const arr = [9, 5, 1, 8, 2, 7, 3];
    console.log("Original array: ");
    printArray(arr);
    quicksort(arr, 0, arr.length - 1);
    console.log("Sorted array: ");
    printArray(arr);
}
main();
