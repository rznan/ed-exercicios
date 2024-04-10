package controller;

public class MultiplicacaoController {

	public MultiplicacaoController() {}
	
	public int multiplicar(int a, int b)
	{
		if(b <= 0) return 0;
		
		return a + multiplicar(a, --b);
	}
}
