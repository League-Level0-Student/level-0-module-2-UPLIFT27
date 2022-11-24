package _01_random._6_lottery_numbers;

import java.util.Random;

public class RandomLOTTERYNUMBERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomMaker = new Random();

	String loto = "";
		
	System.out.println("Your lottery Number is");	
	for(int i=0;i<6;i++)
	{
	 loto += randomMaker.nextInt(100)+" " ;
	}
	System.out.println(loto)	;
}
}