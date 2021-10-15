package solve;

public class NewId {
	
	/*
	 * 1. ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ
	 * 2. ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���� ����
	 * 3. ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
	 * 4. ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
	 * 5. �� ���ڿ��̶�� "a"�� ����
	 * 6. 16�� �̻��̸�, ù 15���� ���ڸ� ������ ������ ���ڸ� ����
	 * 7. ���� �� ��ħǥ(.)�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.)���ڸ� ����
	 * 8. ���̰� 2�� ���϶��, ������ ���ڸ� ���̰� 3�� �� �� ���� �ݺ�
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
