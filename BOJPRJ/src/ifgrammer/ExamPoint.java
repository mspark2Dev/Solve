package ifgrammer;

import java.util.Scanner;

public class ExamPoint {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println(a < 101 && a > 89 ? "A" : a < 90 && a > 79 ? "B" : a < 80 && a > 69 ? "C" : a < 70 && a > 59 ? "D" : "F");
	}

}
