package com.mzr.calctest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.mzr.calc.CalcService;
import com.mzr.calc.Calculator;

public class CalculatorTest {
	
	CalcService service = Mockito.mock(CalcService.class);
	
	Calculator c = null;
	@Before
	public void getService() {
		c = new Calculator(service);
	}
	@Test
	public void testAdd() {
		Mockito.when(service.calcService(2, 3)).thenReturn(5);
		assertEquals(5, c.add(2, 3));
	}

}
