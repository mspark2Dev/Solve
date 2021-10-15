package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dial {
	
	public static void main(String[] args) {
		int defaultSec = 2;
		String[] dials = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ",""};
		Scanner sc = new Scanner(System.in);
		String call = sc.nextLine();
		sc.close();
		String[] callNumbers = call.split("");
		List<Integer> index = new ArrayList<Integer>();
		
		for(String c : callNumbers) {
			for(int i=0; i<dials.length; i++) {
				if(dials[i].indexOf(c) > -1) index.add(i);
			}
		}
		
		int sum = 0;
		
		for(int a : index) {
			sum += a + defaultSec;
		}
		
		System.out.println(sum);
	}

}
