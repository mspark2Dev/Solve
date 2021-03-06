package onedimension;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageControl {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float max = -1;
		List<Float> arr = new ArrayList<Float>();
		for(int i=0; i<n; i++) {
			float a = sc.nextFloat();
			arr.add(a);
			max = a > max ? a : max;
		}
		sc.close();
		
		for(int j=0; j<arr.size(); j++) {
			arr.set(j, arr.get(j)/max*100);
		}
		
		float sum = 0;
		
		for(float s : arr) {
			sum += s;
		}
		System.out.println(sum/n);
	}

}
