package solve;

import java.util.Stack;

public class CrainDollCatch {

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<Integer>();
		
		for(int m : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][m-1] != 0) {
					int now = board[i][m-1];
					if(basket.isEmpty() || basket.peek() != now) {
						basket.push(board[i][m-1]);
					} else {
						basket.pop();
						answer++;
					}
					board[i][m-1] = 0;
					break;
				}
			}
		}
		
		return answer * 2;
	}

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };

		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		
		System.out.println(solution(board, moves));
	}

}
