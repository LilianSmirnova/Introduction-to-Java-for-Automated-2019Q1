package com.epam.liliana_smirnova.java.lesson1.task2;
/*
 * Class for working with strings
 */

public class StringProcessing {

	public static void main(String[] args) {
		StringProcessing appString = new StringProcessing();
		appString.runApplication();
	}

	public void runApplication() {
		LogicStringProcessing logicStr = new LogicStringProcessing();
		logicStr.createStrings();
		logicStr.findStrings();
		logicStr.printInfoString();
	}
}