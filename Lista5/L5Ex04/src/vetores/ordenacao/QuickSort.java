package vetores.ordenacao;

public class QuickSort {
    public QuickSort(){}

    public int[] sort(int[] arr, int start, int end){
        if( start < end ) {
            int pivot = divide(arr, start, end);
            sort(arr, start, pivot-1);
            sort(arr, pivot+1, end);
        }
        return arr;
    }

    private int divide(int[] arr, int start, int end) {
        int pivot = arr[start];

        int left = start+1;
        int right = end;

        while( left <= right ) {
            while( left <= right && arr[left] < pivot ) {
                left++;
            }
            while ( right >= left && arr[right] > pivot) {
                right--;
            }
            if( left <= right ) {
                swap(arr, left++, right--);
            }
        }

        swap(arr, start, right);

        return right;
    }

    private void swap(int[] arr, int i, int j) {
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }

}
