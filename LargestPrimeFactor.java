package day4;

import java.math.BigInteger;

public class LargestPrimeFactor {


	public static void main(String[] args){
		//findLargestPrimeFactor(180);
		
		//given a number
		// find all the prime factors from smallest(2) to largest
		// and then find the largest prime factor
		findLargestPrimeFactor(13195);
	}


	public static void findLargestPrimeFactor(long number){
		
		// start smallest prime factor
		int factor = 2;
		int largestFactor = 1;
		
		while(factor <= number){
			if(number % factor == 0){
				
				if(factor > largestFactor) {
					largestFactor = factor;
				}
				
				number = number / factor;
				//System.out.println(number + "  " + factor);
				
			}else{
				factor = factor + 1; //
			}
		}
		
		System.out.println(largestFactor);


	}







}
