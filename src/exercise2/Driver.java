package exercise2;

import java.util.Random;
import java.util.Scanner;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;

		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an Integer: ");

		int target = scanner.nextInt();

		System.out.println("The index found of " + target + " is: " + binarySearch(nums, target));
	}

	public static int binarySearch(Integer [] nums, int target) 
	{
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int middlePoint = (right+left)/2;

			if (nums[middlePoint] == target) {
				return  middlePoint;
			}

			else if (nums[middlePoint] > target) {
				right = middlePoint - 1;
			}

			else {
				left = middlePoint + 1;
			}
		}
		return -1;
	}

}
