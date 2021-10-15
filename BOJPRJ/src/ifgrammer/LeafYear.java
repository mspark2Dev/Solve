package ifgrammer;

import java.util.Scanner;

public class LeafYear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.println(a % 4 == 0 && a % 100 != 0 ? 1 : a % 400 == 0 ? 1 : 0);
	}

}
