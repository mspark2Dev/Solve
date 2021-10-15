package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Sangsoo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		
		String[] nums = line.split(" ");
		int[] reversNums = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			String[] splits = nums[i].split("");
			String revers = "";
			for(int j=splits.length-1; j>-1; j--) {
				revers+=splits[j];
			}
			reversNums[i] = Integer.parseInt(revers);
		}
		
		System.out.println(Arrays.stream(reversNums).max().getAsInt());
	}

}
