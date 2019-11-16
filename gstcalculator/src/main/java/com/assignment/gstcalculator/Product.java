package com.assignment.gstcalculator;


public class Product 
{
	protected double interest; 
	public double[] calculateGst(double price,int unit)
	{	
		if(price<0 || unit<0)
			return null;
		double[] ans = new double[2]; 
        ans[0] =price*(this.interest/100);
        ans[1] = unit*(price+ans[0]); 
        return ans; 
	}
}