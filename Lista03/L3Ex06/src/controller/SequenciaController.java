package controller;
public class SequenciaController {
    public SequenciaController() {}

    public double calcularSequencia(int n){
        // A ideia dessa função é começar do último elemento da sequência e calcular recursivamente o valor dos elementos
        // anteriores.

        // A condição de parada é quando o valor de n == 1. Nesse momento o valor do elemento é 1, que é o primeiro elemento
        // da sequência. Além disso, continuar a sequência além de 1 resultará em uma divisão por 0.
        if(n <= 1) return 1;
        return (double) 1/calcularFatorial(n) + calcularSequencia(--n);
    }

    public int calcularFatorial(int n){
        if(n <= 0) return 1;
        return n * calcularFatorial(--n);
    }
}
