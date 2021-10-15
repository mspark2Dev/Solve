package ioandsachick;

import java.util.Arrays;
import java.util.Scanner;

public class Multiple {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		String[] c = Integer.toString(b).split("");
		int[] d = Arrays.stream(c).mapToInt(Integer::parseInt).toArray();
		for(int i=d.length-1; i>-1; i--) {
			System.out.println(a*d[i]);
		}
		System.out.println(a*b);
	}

}
