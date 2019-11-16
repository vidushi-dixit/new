package com.assignment.gstcalculator;

public class ProductFactory 
{
	public Product getProduct(String productName)
	{
		if(productName == null)
             return null; 
		else if(FoodGrains.getProductList().contains(productName))
			return new FoodGrains();
		else if(Furniture.getProductList().contains(productName))
			return new Furniture();
		else if(Electronics.getProductList().contains(productName))
			return new Electronics();
		else if(Cosmetics.getProductList().contains(productName))
			return new Cosmetics();
		return null;
	}
}
