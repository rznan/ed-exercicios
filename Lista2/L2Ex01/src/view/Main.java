package view;

import controller.MultiplicacaoController;

public class Main {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		var multController = new MultiplicacaoController();
		
		int result = multController.multiplicar(a, b);
		
		System.out.println("A multiplicação de " + a + " por " + b + " é: " + result);

	}

}
