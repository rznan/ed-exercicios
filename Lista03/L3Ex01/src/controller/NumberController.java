package controller;
public class NumberController {
    public  NumberController(){}

    public int countDecimalDigits(int n){
        // Essa é a entrada da função. Ela surge da necessidade de contar 0 como um valor com 1 digito,
        // e caso o parâmetro seja diferente de 0 a função recursiva é chamada para calcular seu tamanho
        if(n == 0) return 1;
        else return countDecimalDigits(n, true);
    }

    private int countDecimalDigits(int n, boolean notUsed){
        // Essa função recebe um número n (na base 10) qualquer e calcula a sua quantidade de dígitos
        // por múltiplas divisões por 10. A ideia é que a cada regressão o valor de n seja dividido
        // por 10, para 'descartar' o último número, e o valor de retorno seja incrementado por
        // 1 + quantidade de dígitos n (já dividido por 10).

        // A condição de parada é quando o valor de n alcançar 0, pois nesse ponto o número já foi divido
        // até que não sobraram mais dígitos para 'descartar';
        if(n == 0) return 0;
        return countDecimalDigits(n / 10, !notUsed) + 1;
    }
}
