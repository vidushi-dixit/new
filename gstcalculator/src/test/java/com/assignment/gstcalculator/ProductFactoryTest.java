package com.assignment.gstcalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductFactoryTest 
{
	@InjectMocks
	private ProductFactory mockFactory;
	@Test
    public void testCreateNull() throws Exception 
	{
		assertEquals(mockFactory.getProduct(null), null);
    }
	
	@Test
    public void testCreateNotExisting() throws Exception 
	{
		assertEquals(mockFactory.getProduct("Clothes") ,null);
    }
	@Test
    public void testCreateFoodGrain() throws Exception 
	{
		assertTrue(mockFactory.getProduct("Rice") instanceof FoodGrains);
    }
	@Test
    public void testCreateFurniture() throws Exception 
	{
		assertTrue(mockFactory.getProduct("Sofa") instanceof Furniture);
    }
	@Test
    public void testCreateElectronics() throws Exception 
	{
		assertTrue(mockFactory.getProduct("TV") instanceof Electronics);
    }
	@Test
    public void testCreateCosmetics() throws Exception 
	{
		assertTrue(mockFactory.getProduct("Perfume") instanceof Cosmetics);
    }
	
}
