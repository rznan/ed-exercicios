package view;

import controller.VetorController;

public class Main {
	public static void main(String[] args) {
		var vetController = new VetorController();
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		
		boolean isValid = true;
		for(int n : arr)
			if(n <= 0 ) isValid = false;
		
		if(isValid)
		{
			int result = vetController.contarParesDiferentesdeZero(arr, arr.length);
			System.out.println("O vetor tem " + result + " números pares");
		}
		else
		{
			System.out.println("Vetor não deve possuit valores negativos ou iguais a zero");
		}
	}
}
