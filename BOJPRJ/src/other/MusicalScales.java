package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MusicalScales {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		br.close();
		
		int comp = a[0] - a[1];
		int preA = a[1];
		String res = "";
		
		for(int i=2; i<a.length; i++) {
			int b = preA - a[i];
			
			if(comp != b) {
				res = "mixed";
				break;
			}
			
			preA = a[i];
		}
		
		if(!res.equals("mixed") && comp == 1) {
			res = "descending";
		} else if(!res.equals("mixed") && comp == -1) {
			res = "ascending";
		}
		
		System.out.println(res);
		
	}

}
