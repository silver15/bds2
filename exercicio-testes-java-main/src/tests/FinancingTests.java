package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreatObjectWhenValidadData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptonWhenInvalidData() {
	
	Assertions.assertThrows(IllegalArgumentException.class, ()-> {
		Financing f = new Financing(100000.0, 2000.0, 20);
		
	});
		
	}
	
	@Test
	public void SetTotalAmoutShouldCreatObjectWhenValidadData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setTotalAmount(90000.0);
		
		Assertions.assertEquals(90000.0, f.getTotalAmount());
		
	}
	
	@Test
	public void SetTotalAmoutShouldThrowIllegalCreatObjectWhenValidadData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(1100000.0);
			
		});
	
	}
	
	@Test
	public void SetIcomeShouldCreatObjectWhenValidadData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setIncome(2100.0);
	
		Assertions.assertEquals(2100.0, f.getIncome());
		
	}
	
	@Test
	public void SetIcomeShouldThrowIllegalCreatObjectWhenValidadData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1900.0);
			
		});
	
	}
	
	@Test
	public void setMonthsShouldCreatObjectWhenValidadData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		f.setMonths(90);
	
		Assertions.assertEquals(90, f.getMonths());
		
	}
	
	@Test
	public void setMonthsShouldThrowIllegalCreatObjectWhenValidadData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(20);
			
		});
	
	}
	
	@Test
	public void entrysShouldCreatObjectWhenValidadData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
			
		Assertions.assertEquals(20000.0, f.entry());
		
	}
	
	@Test
	public void quotasShouldCreatObjectWhenValidadData() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
			
		Assertions.assertEquals(1000.0, f.quota());
		
	}
	
}
