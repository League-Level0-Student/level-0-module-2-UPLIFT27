//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

		
		
		if (randomNumber ==1)
{
	System.out.println("You look good");
}
else if(randomNumber == 2)
{
	System.out.println("You are funny");
}
else if(randomNumber==3)
{
	System.out.println("You are cool");

}
else if(randomNumber==4)
{
	System.out.println("You are smart");
	
}
else if(randomNumber==5)
{
	System.out.println("You are friendly");
}
else if(randomNumber==6)
{
 System.out.println("You are spectacular");	
}
else if(randomNumber==7)
{
System.out.println("You are amazing");
}	
else if(randomNumber==8)
{
System.out.println("You are magnificent");	
}
else if(randomNumber==9)
{
	System.out.println("you are the best");
}
		
else if(randomNumber==10)
{
	System.out.println("You are beautiful");
}
	
	}

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}

