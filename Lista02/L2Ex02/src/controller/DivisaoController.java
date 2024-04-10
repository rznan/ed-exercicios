package controller;

public class DivisaoController {
	public DivisaoController(){}
	
	public int restoDivisao(int dividendo, int divisor){
		if(dividendo < divisor) return dividendo;
		
		return restoDivisao(dividendo - divisor, divisor);
	}

}
