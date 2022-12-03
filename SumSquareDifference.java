package day5;

public class SumSquareDifference {

	public static void main(String[] args){
		
		
		sumSquareDifference(100);
	}

	public static void sumSquareDifference(int n){
		int start = 1;
		int sumOfSquares = 0;
		int squaresOfSums = 0;
		int sum = 0;

		while(start <= n){
			sum = sum + start;
			sumOfSquares = sumOfSquares + (start * start);

			start = start + 1;
		}

		squaresOfSums = sum * sum;

		int sumSquareDifference = squaresOfSums - sumOfSquares;

		System.out.println(sumSquareDifference);

	}




}
