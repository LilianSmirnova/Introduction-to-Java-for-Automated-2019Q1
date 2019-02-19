package com.epam.liliana_smirnova.java.lesson1.task2;

import java.util.Scanner;

public class LogicStringProcessing {

	Scanner scan = new Scanner(System.in);
	String[] stringArray;
	int countRows;
	String shortString = null;
	String longString = null;
	
	public void createStrings() {
        System.out.println("Enter the number of rows:");
        countRows = scan.nextInt();
        stringArray = new String[countRows];
        for (int i = 0; i < countRows; i++) {
            System.out.println("Enter "+(i+1)+" text row");
            stringArray[i] = scan.next();
        }
        System.out.println();    
	}		
	
	public void findStrings() {
		for (int i= 0; i < countRows; i++) {
			if (shortString == null || stringArray[i].length() < shortString.length()) {
				shortString = stringArray[i];
			} else if (longString == null || stringArray[i].length() > longString.length()) {
				longString = stringArray[i];
			}
		}
	}
	
	public void printInfoString() {
		System.out.println("\nShortest line:"+shortString);
		System.out.println("Number of characters per line:"+shortString.length());
		System.out.println("\nLongest string:"+longString);
		System.out.println("Number of characters per line:"+longString.length());
	}
}
	

