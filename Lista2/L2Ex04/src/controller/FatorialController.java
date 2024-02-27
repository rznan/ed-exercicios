package controller;

public class FatorialController {
	public FatorialController() {}
	
	public int fatorialDuplo(int val) {
		if(val <= 0) return 1;
		return val * fatorialDuplo(val - 2);
	}

}
