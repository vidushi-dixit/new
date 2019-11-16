package com.assignment.gstcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodGrains extends Product 
{
	FoodGrains() 
    { 
        this.interest=0; 
    } 
	private static ArrayList<String> productList;
	static
	{
		productList = new ArrayList<String>( Arrays.asList("Rice","Wheat","Dal" )); 
	}
	public static List<String> getProductList()
	{
		return productList;
	}
}