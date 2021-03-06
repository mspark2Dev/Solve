package solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OpenTalk {

	public static String[] solution(String[] record) {
		List<String> commands = new ArrayList<String>();
		List<String> uid = new ArrayList<String>();
		HashMap<String, String> user = new HashMap<String, String>();
		List<String> answer = new ArrayList<String>();

		for (String a : record) {
			commands.add(a.split(" ")[0]);
			uid.add(a.split(" ")[1]);
			if (a.split(" ").length == 3) {
				user.put(a.split(" ")[1], a.split(" ")[2]);
			}
		}

		int idx = 0;
		for (String c : commands) {
			switch (c) {
			case "Enter":
				answer.add(user.get(uid.get(idx)) + "???? ?????Խ??ϴ?.");
				break;
			case "Leave":
				answer.add(user.get(uid.get(idx)) + "???? ???????ϴ?.");
				break;
			}

			idx++;
		}

		return answer.toArray(new String[answer.size()]);
	}

	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };

		System.out.println(Arrays.toString(solution(record)));
	}

}
