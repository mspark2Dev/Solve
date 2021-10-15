package whilegrammer;

import java.util.Scanner;

public class AddCycle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int sum = a;
		int cnt = 0;
		
		while(true) {
			int x = sum / 10;
			int y = sum % 10;
			sum = y * 10 + (x + y) % 10;
			cnt ++;
			if(sum == a) {
				break;
			}
		}
		
		System.out.println(cnt);
		
		
	}

}
