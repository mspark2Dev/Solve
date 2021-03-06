package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumbersSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fLine = br.readLine();

		int sum = 0;

		int[] numbers = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

		for (int a : numbers) {
			sum += a;
		}
		
		System.out.println(sum);

	}

}
