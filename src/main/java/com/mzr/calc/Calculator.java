package com.mzr.calc;

public class Calculator {
	
	private CalcService service;
	
	public Calculator(CalcService service) {
		this.service = service;
	}
	
	public int add(int a, int b) {
		return service.calcService(a, b);
	}

}
