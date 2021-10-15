package solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStringAndEnglish {

	public static int solution(String s) {
		String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		List<String> numbers = new ArrayList<String>();
		numbers.addAll(Arrays.asList(number));
		
		for(String n : numbers) {
			s = s.replaceAll(n, Integer.toString(numbers.indexOf(n)));
		}
		
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		String[] s = { "one4seveneight", "23four5six7", "2three45sixseven", "123" };

		for (String a : s) {
			System.out.println(solution(a));
		}
	}

}
