package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class SentenceEdu {
	
	public static int max = 0;
	
	public static void main(String[] args) throws IOException {
		max = -1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sentence = br.readLine();
		
		br.close();
		
		sentence = sentence.toUpperCase();
		
		String[] sArr = sentence.split("");
		
		HashSet<String> sSet = new HashSet<String>();
		for(String s : sArr) {
			sSet.add(s);
		}
		String[] noDupl = sSet.toArray(new String[0]);
		int[] count = new int[noDupl.length];
		
		for(int i=0; i<noDupl.length; i++) {
			int j=0;
			while(j<sentence.length()) {
				if(noDupl[i].charAt(0) == sentence.charAt(j)) {
					count[i]++;
				}
				max = max < count[i] ? count[i] : max;
				j++;
			}
		}
		
		if(Arrays.stream(count).filter(c -> c == max).count() > 1) {
			System.out.println("?");
		} else {
			for (int i=0; i<count.length; i++) {
				if(count[i] == max) {
					System.out.println(noDupl[i]);
					break;
				}
			}
		}
	}

}
