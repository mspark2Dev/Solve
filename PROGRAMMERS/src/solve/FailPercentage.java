package solve;

import java.util.ArrayList;
import java.util.List;

public class FailPercentage {

	public static int[] solution(int N, int[] stages) {
		int[] answer = {};
		int[] arrival = new int[N];
		int[] fail = new int[N];

		return answer;
	}

	public static void main(String[] args) {
		int[] N = { 5, 4 };

		int[] s1 = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] s2 = { 4, 4, 4, 4, 4 };
		List<int[]> stages = new ArrayList<int[]>();
		stages.add(s1);
		stages.add(s2);

		for (int i = 0; i < stages.size(); i++) {
			System.out.println(solution(N[i], stages.get(i)));
		}
	}

}
