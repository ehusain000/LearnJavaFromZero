package day3;

public class SumOfEvenFibonacciNumbers {


	public static void main(String[] args){

		sumOfEvenFibonacciNumbers(4000000);

	}

	public static void sumOfEvenFibonacciNumbers(int givenNumber){

		int prevNumber = 1;
		int currentNumber = 1;
		int sum = 0;
		

		while(currentNumber < givenNumber){
			
			if(currentNumber % 2 == 0) {
				sum = sum + currentNumber;
				System.out.println("currentNumber: " + currentNumber);
				System.out.println("sum so far: " + sum);
				System.out.println();
			}
			int nextNumber = prevNumber + currentNumber;
			prevNumber = currentNumber;
			currentNumber = nextNumber;

			
		}

	}





}
