package ifgrammer;

import java.util.Scanner;

public class AcompareB {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = Integer.parseInt(s.split(" ")[0]);
		int b = Integer.parseInt(s.split(" ")[1]);
		sc.close();
		System.out.println(a > b ? ">" : a == b ? "==" : "<");
	}
	
}
