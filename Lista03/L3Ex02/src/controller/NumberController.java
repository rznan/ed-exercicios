package controller;

public class NumberController {
    public NumberController() {}

    public int countDigits(int num, int digit) {

        // Essa função retorna quantas vezes digit aparece em num através de uma função recursiva que
        // Consegue 'ver' o último valor do num pelo resto da divisão de num por 10 e verificar se este
        // é igual ao digit e, caso seja, a variável isDigit recebe 1, caso contrário ela recebe 0. Depois,
        // essa função retorna isDigit + a chamada de si mesma descartando o último digito de num (realizando
        // uma divisão inteira de num por 10). No fim, a soma de todos isDigits representa quantas vezes
        // aquele digito apareceu no número.

        // A condição de parada é num não ter mais dígitos, ou seja, quando a divisão de num por 10 for 0
        if(num == 0) return 0;

        int isDigit = num % 10 == digit ? 1 : 0;

        return isDigit + countDigits(num / 10, digit);
    }
}
