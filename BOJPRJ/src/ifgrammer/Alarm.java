package ifgrammer;

import java.util.Scanner;

public class Alarm {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(m >= 45) {
			m -= 45;
			System.out.println(h + " " + m);
		} else if (h != 0) {
			h -= 1;
			m = 60 - (45 - m);
			System.out.println(h + " " + m);
		} else {
			h = 23;
			m = 60 - (45 - m);
			System.out.println(h + " " + m);
		}
	}

}
