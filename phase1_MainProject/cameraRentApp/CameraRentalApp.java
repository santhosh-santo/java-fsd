package cameraRentApp;

import java.util.Scanner;

public class CameraRentalApp {
	
	public static void main(String[] args) {

		
		boolean loginWhileLoop = true;
		// AdminPerformOperations object is called
		AdminPerformOperations adminPerformOperations = new AdminPerformOperations();
		AdminTask adminTask = new AdminTask();
		

		// Scanner class object is called
		Scanner sc = new Scanner(System.in);

		System.out.println("+ --------------------------------------- +");
		System.out.print("|       ");
		System.out.print("Welcome to Camera Renatal App");
		System.out.println("     |");
		System.out.println("+ --------------------------------------- +");

		adminPerformOperations.adminLogin();
		// AdminTask object is called

		if (adminPerformOperations.adminLoginSuccess) {
			adminTask.adminAllTask();
		}
	}

}
