package day1;

public class Products {
	public static void main(String[] args) {

		//we have collection of integers, they could be any integer
		int[] numbers1 = {1, 2, 3, 4, 5, 12, 1, 2, 3, 4, 5,1, 2, 3, 4, 5};

		int[] numbers2 = {1, 2, 3, 4, 5, 12, 1, 2, 3, 4, 5,1, 2, 3, 4, 5, 1, 2, 3, 4, 5,1};


		//this method will calculate the product of an any collection of integers
		productOfNumbers(numbers1);
		System.out.println();
		productOfNumbers(numbers2);

	}

	//name of method is productOfNumbers
	//productOfNumbers takes in a collection of numbers
	// we have something called product
	//and then it takes 1 integer at a time and then multiplies with product and
	//product will
	public static void productOfNumbers(int[] numbers){


		int product = 1;

		for(int i = 5; i < numbers.length; i++){
			product = product * numbers[i];
			System.out.println(product);
		}

	}
}
