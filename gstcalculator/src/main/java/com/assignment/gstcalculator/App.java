package com.assignment.gstcalculator;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	String input="yes";
		ProductFactory productFactory=new ProductFactory();
		Scanner sc = new Scanner(System.in);
		while(input.equalsIgnoreCase("yes"))
		 {
			 System.out.print("Enter unit:");
			 int unit = sc.nextInt();
			 System.out.print("Enter product name:");
			 String productName = sc.next();
			 System.out.print("Enter price per unit:");
			 double price = sc.nextDouble();
			 Product product= productFactory.getProduct(productName);
			 if(null==product)
				 System.out.println("No such product exists");
			 else
			 {
				 double[] gst=product.calculateGst(price, unit);
				 System.out.println("GST aplicable per unit:"+gst[0]);
				 System.out.println("Final Price:"+gst[1]);
			 }
			 System.out.print("Enter yes to continue:");
			 input=sc.next();
		 }
		 sc.close();
    }
}
