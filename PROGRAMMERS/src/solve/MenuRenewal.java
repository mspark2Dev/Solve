package solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuRenewal {
	
	public static String[] solution(String[] orders, int[] course) {
		String[] answer = {};
		
		return answer;
	}
	
	public static void main(String[] args) {
		List<String[]> orders = new ArrayList<String[]>();
		List<int[]> course = new ArrayList<int[]>();
		orders.add(("ABCFG,AC,CDE,ACDE,BCFG,ACDEH").split(","));
		orders.add(("ABCDE,AB,CD,ADE,XYZ,XYZ,ACD").split(","));
		orders.add(("XYZ,XWY,WXA").split(","));
		course.add(Arrays.stream(("2,3,4").split(",")).mapToInt(Integer::parseInt).toArray());
		course.add(Arrays.stream(("2,3,5").split(",")).mapToInt(Integer::parseInt).toArray());
		course.add(Arrays.stream(("2,3,4").split(",")).mapToInt(Integer::parseInt).toArray());
		
		for(int i=0; i<orders.size(); i++) {
			System.out.println(solution(orders.get(i), course.get(i)));
		}
	}

}
