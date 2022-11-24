//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._5_magic_8_ball;

import java.util.Random;

public class Magic8Ball {
	public static void main(String[] args) {
		// 1. Make a main method that includes all the steps below
		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(4);

		System.out.println(randomNumber);
		// 2. Get the user to enter a question for the 8 ball to answer

		// 3. Make a variable and initialize it to a random number.
		// ** You will need to make a random object!
		// Limit the random numbers to be between 0 and 3

		// 4. If the random number is 0
		if (randomNumber == 0) {
			System.out.println("yes");
		}
		// -- tell the user "Yes"

		// 5. If the random number is 1
		else if (randomNumber == 1) {
			System.out.println("No");
		}
		// -- tell the user "No"

		// 6. If the random number is 2
		else if (randomNumber == 2) {
			System.out.println("Maybe you should ask Google");
		}
		// -- tell the user "Maybe you should ask Google?"
		else if (randomNumber == 3) {
			System.out.println("Only time will tell");
		}
		// 7. If the random number is 3

		// -- write your own answer

	}
}
