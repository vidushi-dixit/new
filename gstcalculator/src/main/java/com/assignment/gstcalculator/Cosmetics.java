package com.assignment.gstcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cosmetics extends Product{

	Cosmetics() 
    { 
        this.interest=28; 
    }
	private static ArrayList<String> productList ;
	static
	{
		productList= new ArrayList<String>( Arrays.asList("Cream","Perfume","Lotion" )); 
	}
	 public static List<String> getProductList()
	 {
		 return productList;
	 }
}
