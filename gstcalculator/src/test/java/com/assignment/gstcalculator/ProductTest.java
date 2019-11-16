package com.assignment.gstcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductTest
{
	@InjectMocks
	private Electronics mockProduct;
	
	@Test
    public void testCalculateGstNegativeValue() throws Exception 
	{
		assertEquals(mockProduct.calculateGst(-1, -1),null);
    }
	
	@Test
    public void testCalculateGst() throws Exception 
	{
		double[] expected=new double[2]; 
		expected[0]=18;
		expected[1]=1416;
		double[] actual=mockProduct.calculateGst(100, 12);
		assertEquals(actual[0],expected[0],0.000001);
		assertEquals(actual[1],expected[1],0.000001);
    }
}
