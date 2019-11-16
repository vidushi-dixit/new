package com.assignment.gstcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electronics extends Product{
	Electronics() 
    { 
        this.interest=18; 
    }
	private static ArrayList<String> productList ;
	static
	{
		productList= new ArrayList<String>( Arrays.asList("Mobile","TV","Tablet" ));
	}
	public static List<String> getProductList()
	{
		 return productList;
	}
}
