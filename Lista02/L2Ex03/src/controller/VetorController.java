package controller;

public class VetorController {

	public VetorController() {}
	
	public int contarParesDiferentesdeZero(int[] arr, int len){
		if(len <= 0) return 0;
		
		int ehPar = arr[len - 1] % 2 == 0? 1 : 0;
		
		return ehPar + contarParesDiferentesdeZero(arr, --len);
	}
}
