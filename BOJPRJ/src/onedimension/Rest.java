package onedimension;

import java.util.HashSet;
import java.util.Scanner;

public class Rest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> arr = new HashSet<Integer>();
		for(int i=0; i<10; i++) {
			arr.add(sc.nextInt()%42);
		}
		sc.close();
		
		System.out.println(arr.size());
	}

}
