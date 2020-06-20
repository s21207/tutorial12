package pgo11;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
			fillArray(input, arr, i);
		
		input.close();
		System.out.println(Arrays.toString(arr));
	}
	
	public static int readNumber(Scanner input) throws NegativeNumberException {
		
		
		int n = input.nextInt();

		
		if (n < 0)
			throw new NegativeNumberException();
		
		return n;
	}
	
	public static void fillArray(Scanner input, int[] arr, int i) {
		int n = 0;
		
		try {
			 n = readNumber(input);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
			arr[i] = 0;
		}
		
		arr[i] = n;
		
	}
}

class NegativeNumberException extends Exception{

	public NegativeNumberException() {
		super("Negative numbers are not allowed");
	}
	
}
