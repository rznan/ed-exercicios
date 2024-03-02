package controller;
public class ReversorController {
    public ReversorController(){}

    public String revert(String s, int length){
        // Se a string tem 1 de tamanho ela é idêntica ao seu reverso; por isso, é a condição de parada
        if(length <= 1) return s;

        return
                s.substring(length-1) +              // caractére final +
                revert(s.substring(0, length-1), --length);     // Reverte o restante da string;
    }
}
