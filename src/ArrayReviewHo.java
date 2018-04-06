import java.util.Random;

/**
 * @author Hien Ho
 * This program will generate and populate 10 random numbers into each position
 * of one array with size 10. It will output each element by using two ways: For Enhanced Loop and Regular For Loop
 */

public class ArrayReviewHo {
	public static void main(String [] args) {
		
		// size of array
		int [] intArray = new int [10];
		
		// filling the new array with random number between 1 and 25 by using for loop
		// using Math Random to generate the random number between 1 and 25
		Random rand = new Random();		
		for(int i = 0; i<10; i++) {
			int randomNumber = rand.nextInt(25)+1;
			intArray[i] = randomNumber;
			System.out.println(intArray[i]);
		}
		// making space
		System.out.println(" ");
		
		// enhanced loop to print to the array
		for(int i = 0; i <10; i++) {
			System.out.println("Enhanced for loop: " + intArray[i]);
		}
		// making space
		System.out.println(" ");
		
		// a loop of my choice to print to the array
		for (int i = 0; i<10; i++) {
			System.out.println("ArrayName element at index[" + i + "] = " + intArray[i]);
		}
	}
}
