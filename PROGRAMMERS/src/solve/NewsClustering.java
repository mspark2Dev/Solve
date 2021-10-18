package solve;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {
	
	public static int solution(String str1, String str2) {
		int answer = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		List<String> str1Split = new ArrayList<String>();
		List<String> str2Split = new ArrayList<String>();
		
		for(int i=0; i<str1.length()-1; i++) {
			String now = Character.toString(str1.charAt(i)) + Character.toString(str1.charAt(i+1));
			
			if(now.matches("[a-z]*[A-Z]*")) {
				str1Split.add(now);
			}
		}
		
		for(int i=0; i<str2.length()-1; i++) {
			String now = Character.toString(str2.charAt(i)) + Character.toString(str2.charAt(i+1));
			if(now.matches("[a-z]*[A-Z]*")) {
				str2Split.add(now);
			}
		}
		
		int inter = 0;
		
		if(str1Split.size() > str2Split.size()) {
			for(String a : str2Split) {
				if(str1Split.indexOf(a) > -1) {
					inter ++;
					str1Split.remove(str1Split.indexOf(a));
				}
			}
		} else {
			for(String a : str1Split) {
				if(str2Split.indexOf(a) > -1) {
					inter ++;
					str2Split.remove(str2Split.indexOf(a));
				}
			}
		}
		
		List<String> union = new ArrayList<String>();
		union.addAll(str1Split);
		union.addAll(str2Split);
		
		if(union.size() == 0 && inter == 0) {
			answer = 65536;
		} else {
			double j = ((double) inter / (double) union.size()) * 65536;
			answer = (int) j;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] str1 = {"FRANCE", "handshake", "aa1+aa2", "E=M*C^2"};
		String[] str2 = {"french", "shake hands", "AAAA12", "e=m*c^2"};
		int[] answer = {16384, 65536, 43690, 65536};
		
		for(int i=0; i<str1.length; i++) {
			int res = solution(str1[i], str2[i]);
			System.out.println(res);
			System.out.println(answer[i] == res);
		}
	}

}
