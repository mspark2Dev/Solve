package forgrammer;

import java.util.Scanner;

public class MultipleTable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1; i<10; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}

}
