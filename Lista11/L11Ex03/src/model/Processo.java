package model;

public class Processo {
    public  String nome;
    public int quantidadeRetornos;

    @Override
    public String toString() {
        return String.format("Processo: %s\nQuantidade: %d", this.nome, this.quantidadeRetornos);
    }
}
