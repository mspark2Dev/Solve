package forgrammer;

import java.util.Scanner;

public class StarPrint2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<a+1; i++) {
			for(int j=0; j<a-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
