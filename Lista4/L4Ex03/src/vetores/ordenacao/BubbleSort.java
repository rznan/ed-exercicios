package vetores.ordenacao;

public class BubbleSort {
    public BubbleSort(){}

    public void sort(int[] arr){
        int length = arr.length;
        int aux;
        for(int i = 0; i < length; i++){
            for (int j = 0; j < length-1; j++){
                if(arr[j] > arr[j+1]){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
