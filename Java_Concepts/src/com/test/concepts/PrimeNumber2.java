package com.test.concepts;

public class PrimeNumber2 {
	
	public static void main(String [] args)
	{
		
		for(int i = 2; i < 50; i++)
		{	
			boolean isPrime = true;
			for(int j = 2; j < i ; j++)
			{
				if(i%j == 0)
				{
					isPrime =  false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(i+" number is prime");
			}
		}
	}

}
