package com.epam.liliana_smirnova.java.lesson1.task3;

public class Calculator {
	
	public static void main(String args[]) {
		Calculator appCalc = new Calculator();
		appCalc.startApplication();
	}  
	
	public void startApplication() {
		LogicCalculator calc = new LogicCalculator();
		calc.inputInfo();
		calc.calculation();
	 }
}
