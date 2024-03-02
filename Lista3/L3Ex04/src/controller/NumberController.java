package controller;
public class NumberController {
    public NumberController(){}

    public String IntegerToBinary(int n){
        StringBuilder sb = new StringBuilder();

        String resposta = n == 0 ? "0" : sb.append(divisionToBinary(n)).reverse().toString();

        return resposta;
    }

    private String divisionToBinary(int n){
        // Condição de parada é o número ser 0, a partir desse ponto as divisões subsequentes seriam irrelevantes
        if(n != 0){
            StringBuilder sb = new StringBuilder();

            sb.append(( n % 2) +                        // Valor do resto da visão do número atual
                        divisionToBinary(n/2));     // Calcula a o valor da próxima divisão
            return sb.toString();
        }
        return "";
    }

}
