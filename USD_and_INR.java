// Write a program to convert USD2INR and INR2USD

import java.util.Scanner;

public class USD_and_INR {
	public static void main(String args[]){
		// create object of input class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your choice \n 1)USD to INR \n 2)INR to USD:");
		int ch = input.nextInt();
		switch(ch) {
		case 1:
		System.out.println("Enter the value :");
		int USD = input.nextInt();
		int INR = USD * 70;
		System.out.println("Indian Rupees:" + INR);
		break;
		case 2:
		System.out.println("Enter the value of Indian Rupees:");
		 INR = input.nextInt();
		 USD = INR / 70;
		System.out.println("US Doller:" + USD);
		break;
		default :
		System.out.println("Enter valid choice.");
		break;
		}
	}
}