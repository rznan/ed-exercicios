package view;

import controller.MdcController;

public class Main {

	public static void main(String[] args) {
		int x = 168;
		int y = 180;
		
		var mdcController = new MdcController();
		
		String msg = (x > 0 && y > 0) ?
				"O MDC de " + x + " e " + y + " é: " + mdcController.calcularMDC(x, y) : 
				"Valores de entrada devem ser positivos";
		
		System.out.println(msg);
	}
}
