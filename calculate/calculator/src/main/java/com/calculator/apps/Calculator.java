package com.calculator.apps;

import java.util.Scanner;
import java.io.*;
 
public class Calculator {
	
	public int add(int num1, int num2){
	
		int sum;
		sum = num1 + num2;
		
		return sum;
	}
	
	public int sub(int num1, int num2){
	
		int sum;
		sum = num1 - num2;
		
		return sum;
	}
	
	public int multi(int num1, int num2){
	
		int sum;
		sum = num1 * num2;
		
		return sum;
	}
	
	public int div(int num1, int num2){
	
		int sum;
		sum = num1 / num2;
		
		return sum;
	}
	
	public int mod(int num1, int num2){
	
		int sum;
		sum = num1 % num2;
		
		return sum;
	}
	
	public int pow(int base, int exp){
	
		int sum = 1;
		
		if (exp == 0)
		{
			sum = 1;
		}
		
		while (exp > 0)
		{
			sum = sum * base;
			exp--;
			
		}
	
		
		return sum;
		
	}
    
    public static void main(String[] args) {
    	
    	int choice;
    	int x;
    	int y;
    	int sum;
    	
    	
    	Calculator calc = new Calculator();
    
    	
    	do
    	{
    		System.out.println("Calculator Program");
    		System.out.println("--------------------\n");
    		System.out.println("1.  Add");
    		System.out.println("2.  Subtract");
    		System.out.println("3.  Multiply");
    		System.out.println("4.  Divide");
    		System.out.println("5.  Mod");
    		System.out.println("6.  Power");
    		System.out.println("99. End Program\n");
    		System.out.println("Enter Choice: ");
    		
    		Scanner input = new Scanner(System.in);
    		choice = input.nextInt();
    		
    		while ((choice < 1 || choice > 6) && choice != 99)
    		{
    			System.out.println("Please enter a 1, 2, 3, 4, 5, or 6: " );
    			choice = input.nextInt();
    		}
    			
    	try
    	{
    		FileWriter fstream = new FileWriter("calclog.txt");
    		BufferedWriter out = new BufferedWriter(fstream);
    	
    	
    	switch (choice)
    	{
    		case 1: 
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.add(x,y);
    			System.out.printf("The sum is %d\n\n",sum);
    			out.write(x + "+" + y + "=" + sum);
    			break;
    			
    		case 2:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.sub(x,y);
    			System.out.printf("The sum is %d\n\n",sum);
    			out.write(x + "+" + y + "=" + sum);
    			break;
    			
    		case 3:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.multi(x,y);
    			System.out.printf("The sum is %d\n\n",sum);
    			out.write(x + "+" + y + "=" + sum);
    			break;
    			
    		case 4:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.div(x,y);
    			System.out.printf("The sum is %d\n\n",sum);
    			out.write(x + "+" + y + "=" + sum);
    			break;
    			
    		case 5:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.mod(x,y);
    			System.out.printf("The sum is %d\n\n",sum);
    			out.write(x + "+" + y + "=" + sum);
    			break;
    			
    		case 6:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.pow(x,y);
    			System.out.printf("The sum is %d\n\n",sum);
    			out.write(x + "+" + y + "=" + sum);
    			break;
    	}
    	out.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println("ERROR: Could not open file!");
    	}
    	
    	
    	}
    	while (choice != 99);
    	System.out.println("Ending program...");
    	
    	
    
    }
}