package com.assignment.gstcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Furniture extends Product 
{
	Furniture() 
    { 
        this.interest=5; 
    } 
	private static ArrayList<String> productList;
	static
	{
		productList= new ArrayList<String>( Arrays.asList("Table","Sofa","Chair" )); 
	}
	public static List<String> getProductList()
	{
		return productList;
	}
}
