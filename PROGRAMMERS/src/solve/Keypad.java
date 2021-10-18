package solve;

import java.util.ArrayList;
import java.util.List;

public class Keypad {

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		String[][] keypads = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }, { "*", "0", "#" } };
		int[] leftPosition = {3, 0}; // * 시작
		int[] rightPosition = {3, 2}; // # 시작
		
		for(int a : numbers) {
			String now = String.valueOf(a);
			
			for(int i=0; i<keypads.length; i++) {
				for(int j=0; j<keypads[i].length; j++) {
					if(keypads[i][j].equals(now)) {
						if(now.equals("1")|| now.equals("4") || now.equals("7")) {
							leftPosition[0] = i;
							leftPosition[1] = j;
							answer += "L";
						} else if (now.equals("3")|| now.equals("6") || now.equals("9")) {
							rightPosition[0] = i;
							rightPosition[1] = j;
							answer += "R";
						} else {
							int left = Math.abs(leftPosition[0] - i) + Math.abs(leftPosition[1] - j);
							int right = Math.abs(rightPosition[0] - i) + Math.abs(rightPosition[1] - j);
							
							if(left > right) {
								rightPosition[0] = i;
								rightPosition[1] = j;
								answer += "R";
							} else if (left < right) {
								leftPosition[0] = i;
								leftPosition[1] = j;
								answer += "L";
							} else {
								if(hand.equals("left")) {
									leftPosition[0] = i;
									leftPosition[1] = j;
									answer += "L";
								} else {
									rightPosition[0] = i;
									rightPosition[1] = j;
									answer += "R";
								}
							}
						}
					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		
		String[] result = {"LRLLLRLLRRL", "LRLLRRLLLRR", "LLRLLRLLRL"};

		int[] a1 = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		int[] a2 = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		int[] a3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		List<int[]> numbers = new ArrayList<int[]>();
		numbers.add(a1);
		numbers.add(a2);
		numbers.add(a3);

		String[] hand = { "right", "left", "right" };

		for (int i = 0; i < numbers.size(); i++) {
			String answer = solution(numbers.get(i), hand[i]);
			System.out.println(answer);
			System.out.println(answer.equals(result[i]));
		}

	}

}
