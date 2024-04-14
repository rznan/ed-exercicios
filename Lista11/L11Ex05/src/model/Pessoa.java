package model;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%s - %d - %.2f", nome, idade, altura);
    }
}
