package controller;

public class MdcController {
	public MdcController() {}
	
	public int calcularMDC(int x, int y) {
		
		if(x > y) return calcularMDC(x - y, y);
		
		else if(x < y) return calcularMDC(y, x);

		return x;	
	}

}
