package forgrammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AaddB3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		List<String> arr = new ArrayList<String>();
		
		for(int i = 0; i<t; i++) {
			arr.add(sc.nextLine());
		}
		
		sc.close();
		
		for(String s : arr) {
			String[] ss = s.split(" ");
			System.out.println(Integer.parseInt(ss[0]) + Integer.parseInt(ss[1]));
		}
	}

}
