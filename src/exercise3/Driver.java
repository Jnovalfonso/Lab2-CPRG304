package exercise3;

import java.util.Random;
import java.util.Scanner;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
			// System.out.println( nums[i] );
		}

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Please enter 'b' to Bubble Sort this array of numbers: ");
			String answer = scanner.nextLine();

			if (answer.equals("b")) {

				System.out.println("UNSORTED NUMS");

				for (int num : nums) {
					System.out.println(num);
				}

				bubbleSort(nums);
				System.out.println("SORTED NUMS WITH BUBBLESORT");

				for (int num : nums) {
					System.out.println(num);
				}
				break;
			}		
		}
	}

	public static Integer [] bubbleSort(Integer [] nums) {
		int arrayEnd = nums.length - 1;

		while (arrayEnd != 0) {
			for (int i=0; i!=arrayEnd; i++) {
				if (nums[i] > nums[i + 1]) {
					 int largerNum = nums[i];
					 nums[i] = nums[i + 1];
					 nums[i + 1] = largerNum;
				}
			}
			arrayEnd -= 1;
		}
		
		return nums;
	}

}
