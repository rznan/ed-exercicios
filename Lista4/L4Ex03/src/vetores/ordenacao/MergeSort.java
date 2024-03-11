package vetores.ordenacao;

public class MergeSort {
    public MergeSort(){}

    public void sort(int[] arr, int start, int end){
        if (start < end) {
            int middle = (start + end) / 2;
            sort(arr, start, middle);
            sort(arr, middle+1, end);

            intercala(arr, start, middle, end);
        }

    }

    private void intercala(int[] arr, int start, int middle, int end) {
        int length = arr.length;
        int[] aux = new int[length];

        System.arraycopy(arr, 0, aux, 0, length);

        int left = start;
        int right = middle+1;

        for(int cont = start; cont <= end; cont++){
            if(left > middle){
                arr[cont] = aux[right++];
            }
            else if(right > end){
                arr[cont] = aux[left++];
            }
            else if(aux[left] < aux[right]){
                arr[cont] = aux[left++];
            }
            else {
                arr[cont] = aux[right++];
            }
        }
    }
}
