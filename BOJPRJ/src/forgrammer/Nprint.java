package forgrammer;

import java.util.Scanner;

public class Nprint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<a+1; i++) {
			System.out.println(i);
		}
	}

}
