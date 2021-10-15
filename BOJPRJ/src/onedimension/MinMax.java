package onedimension;

import java.util.Scanner;

public class MinMax {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 1000001;
		int max = -1000001;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			
			min = a < min ? a : min;
			max = a > max ? a : max;
		}
		sc.close();
		System.out.println(min + " " + max);
	}

}
