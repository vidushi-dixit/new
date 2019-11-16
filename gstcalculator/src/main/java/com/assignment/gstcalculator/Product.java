package com.assignment.gstcalculator;


public class Product 
{
	protected double interest; 
	public double[] calculateGst(double price,int unit)
	{	
		double[] ans = new double[2]; 
        ans[0] =unit*price*(this.interest/100);
        ans[1] = (unit*price)+ans[0]; 
        return ans; 
	}
}