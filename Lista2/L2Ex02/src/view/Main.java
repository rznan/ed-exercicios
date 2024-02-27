package view;

import controller.DivisaoController;

public class Main {

	public static void main(String[] args) {
		int divisor = 2;
		int dividendo = 3;
		var divController = new DivisaoController();
		
		int result = divController.restoDivisao(dividendo, divisor);
		
		System.out.println("O resto da divisão de " + dividendo + " por " + divisor + " é: " + result);

	}

}
