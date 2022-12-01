package day2;

public class MultiplesOfThreeOrFive {

	public static void main(String[] args) {
		//multiplesOfThreeOrFive(10);
		multiplesOfThreeOrFive(1000);
		
	}
	
	public static void multiplesOfThreeOrFive(int givenNumber) {
		/*
		 * ex: multiples of 3 or 5 below 10 are
		 * 3, 5, 6, 9
		 * if you divide any number by 3 or 5 and the remainder is 0
		 * then that number is a multiple of 3 or 5
		 * 
		 */
		
		int currentNumber = 1;
		int sum = 0;
		while(currentNumber < givenNumber) {
			if(currentNumber % 3 == 0 || currentNumber % 5 == 0) {
				sum = sum + currentNumber;
				
				//System.out.println(currentNumber);
			}
			
			currentNumber = currentNumber + 1;
			
		}
		System.out.println(sum);
		
		
	}
}



