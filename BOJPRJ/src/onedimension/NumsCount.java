package onedimension;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumsCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int sum = a*b*c;
		List<String> arr = Arrays.asList(Integer.toString(sum).split(""));
		for(int i=0; i<10; i++) {
			String cnt = Integer.toString(i);
			System.out.println(arr.stream().filter(s -> s.equals(cnt)).count());
		}
	}

}
