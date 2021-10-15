package onedimension;

import java.util.Scanner;

public class Max {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -1;
		int cnt = 0;
		int maxIndex = 0;
		for(int i=0; i<9; i++) {
			cnt ++;
			int a = sc.nextInt();
			if(a > max) {
				max = a;
				maxIndex = cnt;
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println(maxIndex);
	}

}
