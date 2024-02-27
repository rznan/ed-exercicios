package view;

import controller.FatorialController;

public class Main {

	public static void main(String[] args) {
		int val = 9;
		var fatController = new FatorialController();
		String msg = (val % 2 != 0 && val >= 0) ? 
				"O fatorial duplo de " + val + " é: " + fatController.fatorialDuplo(val) : 
				"Valor deve ser impar e positivo";
		
		System.out.println(msg);

	}

}
