package forgrammer;

import java.util.Scanner;

public class TnirpN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i = a; i>0; i--) {
			System.out.println(i);
		}
	}
	
}
