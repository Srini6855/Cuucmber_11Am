package com.omr.stepdefinition;

import com.omr.baseclass.Baseclass;

public class Sample extends Baseclass {

	public static void main(String[] args) {

		int a = 153;
		// 1*1*1 + 5*5*5 + 3*3*3 = 153 //27+125+1 = 153
		int arms = 0;
		int b = a;

		// 153 / 10 = 15.3 = 15
		// 153 / 10 = 3
		while (a != 0) {
			int lastDigit = a % 10; // 3
			arms = arms + (lastDigit * lastDigit * lastDigit);
			a = a / 10;
		}

		System.out.println(arms);

		if (b == arms) {
			System.out.println("Given number is armstrong");
		} else {
			System.out.println("Given number is not armstrong");
		}

	}
}
