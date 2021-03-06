package solve;

public class NewId {
	
	/*
	 * 1. 모든 대문자를 대응되는 소문자로 치환
	 * 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
	 * 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
	 * 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
	 * 5. 빈 문자열이라면 "a"를 대입
	 * 6. 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자를 제거
	 * 7. 제거 후 마침표(.)가 끝에 위치한다면 끝에 위치한 마침표(.)문자를 제거
	 * 8. 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때 까지 반복
	 * */

	public static String solution(String new_id) {
		
		new_id = new_id.toLowerCase();
		new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
		new_id = new_id.replaceAll("[.]{2,}", ".");
		
		if(new_id.startsWith(".")) {
			new_id = new_id.substring(1, new_id.length());
		}
		
		if(new_id.endsWith(".")) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}
		
		new_id = new_id.isEmpty() ? "a" : new_id;
		
		if(new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
		}
		
		if(new_id.endsWith(".")) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}
		
		while(new_id.length() < 3) {
			new_id += new_id.charAt(new_id.length()-1);
		}
		
		return new_id;
	}

	public static void main(String[] args) {
		String[] new_id = { "...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p" };

		for (String a : new_id) {
			System.out.println(solution(a));
		}
	}

}
