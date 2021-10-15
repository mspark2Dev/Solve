package function;

import java.util.Scanner;
import java.util.stream.Stream;

public class Hansoo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a<100) {
			System.out.println(a);
		} else {
			int s = 99;
			for(int i=100; i<=a; i++) {
				if(i >= 1000) break;
				int[] digits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
				if(digits[0] - digits[1] == digits[1] - digits[2]) s++;
				
			}
			
			System.out.println(s);
		}
	}

}
