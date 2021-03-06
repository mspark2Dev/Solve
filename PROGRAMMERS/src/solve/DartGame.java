package solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DartGame {
	
	public static int solution(String dartResult) {
		List<String> three = new ArrayList<String>();
		Pattern p = Pattern.compile("[0-9]+[A-Z]+[*|#]*");
		Matcher m = p.matcher(dartResult);
		
		while(m.find()) {
			three.add(m.group());
		}
		
		int[] score = new int[three.size()];
		
		for(int i=0; i<three.size(); i++) {
			score[i] += Integer.parseInt(three.get(i).replaceAll("[^0-9]", "")); // 맞춘 점수
			
			switch(three.get(i).replaceAll("[^A-Z]", "")) { // SDT
			case "S":
				score[i] = (int) Math.pow(score[i], 1);
				break;
			case "D":
				score[i] = (int) Math.pow(score[i], 2);
				break;
			case "T":
				score[i] = (int) Math.pow(score[i], 3);
				break;
			}
			
			if(three.get(i).length() > 2) { // 옵션 있는거
				switch(three.get(i).replaceAll("[^*#]", "")) {
				case "*":
					if(i == 0) {
						score[i] *= 2;
					} else {
						score[i-1] *= 2;
						score[i] *= 2;
					}
					break;
				case "#":
					score[i] *= -1;
					break;
				}
			}
		}
		
		return Arrays.stream(score).reduce(0, Integer::sum);
	}
	
	public static void main(String[] args) {
		String[] dartResult = {"1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*"};
		
		for(String d : dartResult) {
			System.out.println(solution(d));
		}
	}

}
