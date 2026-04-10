/*
File Name: Nested Ifs
Author: Alex Liang
Date Created: April 10, 2026
Date Last Modified: April 10, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int min(int num1, int num2, int num3) {
		int lNum = num1;
		if (num2 < num1) {
			lNum = num2;
		}
		if (num3 < num2) {
			lNum = num3;
		}
		return lNum;
	}


	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			} else {
				return true;
			}
		} 
		else {
			return false;
		}
	}
}
