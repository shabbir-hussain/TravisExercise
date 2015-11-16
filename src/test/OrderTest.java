package test;

import static org.junit.Assert.*;

import org.junit.Test;

import discount.DiscountStrategy;
import discount.Order;
import discount.PercentDiscountStrategy;

public class OrderTest {

	@Test
	public void percentageDiscountTest() {
		Order order = new Order("Shane", 444.0f);
		float amt = 50;
		
	    DiscountStrategy strategy = null;
	    strategy = new PercentDiscountStrategy(amt);
	    
	    float discounted = strategy.applyDiscount(order);
	    
	    //assert equals with 0.01 tolerance
	    assertEquals(222,discounted,0.01);
	    
	}

}
