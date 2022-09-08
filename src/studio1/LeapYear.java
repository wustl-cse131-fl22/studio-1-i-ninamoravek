package studio1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean divisible = false;
		System.out.print("Enter Year ");
		int year1 = in.nextInt();
		divisible = (year1 % 4 == 0) && (year1 % 100 !=0) || (year1 % 400 == 0);
		System.out.println(divisible);
	}
}