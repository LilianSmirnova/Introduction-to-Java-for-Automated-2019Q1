package com.epam.liliana_smirnova.java.lesson1.task3;

import java.util.Scanner;

public class LogicCalculator {
	
	double firstNumber,secondNumber,result;
	char operator;
	private static Scanner scan;
	
	public void inputInfo(){
		scan = new Scanner(System.in);
		System.out.print("\nEnter the first number:  ");
		firstNumber = scan.nextDouble();
		System.out.print("\nEnter the second number:  ");
		secondNumber = scan.nextDouble();
		System.out.print("\nEnter the operator:  ");
		operator = scan.next().charAt(operator);
		
	}
	
	public void calculation(){
		switch (operator) {
				case '+' : addition(); break;
				case '-' : subtraction(); break;
				case '/' : division(); break;
				case '*' : multiplication(); break;
				default : System.out.println("\nUnknown operator"); break;
	   }
	}

	public void multiplication() {
		result = firstNumber * secondNumber;
		System.out.print("\nThe multiplication operation is performed. Result = " + result);
	}
	
	public void addition() {
		result = firstNumber + secondNumber;
		System.out.print("\nThe addition operation is performed. Result = " + result);
	}
	
	public void subtraction() {
		result = firstNumber - secondNumber;
		System.out.print("\nThe subtraction operation is performed. Result = " + result);
	}
	
	public void division() {
		if (secondNumber != 0) {
		    result = firstNumber / secondNumber;
		} else {
			System.out.print("\nDivision by 0 is prohibited.Enter the second number:  ");
			secondNumber = scan.nextDouble();
			result = firstNumber / secondNumber;
		}
		System.out.print("\nThe division operation is performed. Result = " + result);
	}
}

