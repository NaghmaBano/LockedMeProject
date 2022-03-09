package com.simplilearn.assessment.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create "MainDirectory" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("MainDirectory");
		
		MenuOptions.printWelcomeScreen("LockedMe.com", "\t--> Naghma Bano\n" + "\t--> email-Id = naghmabano4official@gmail.com\n");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}

