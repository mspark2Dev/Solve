package solve;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThatSong {
	
	public static String solution(String m, String[] musicinfos) throws ParseException {
		String answer = "(None)";
		int answerTime = 0;
		for(String a : musicinfos) {
			String music = a.split(",")[3];
			int start = (Integer.parseInt(a.split(",")[0].split(":")[0]) * 60) + (Integer.parseInt(a.split(",")[0].split(":")[1]));
			int end = (Integer.parseInt(a.split(",")[1].split(":")[0]) * 60) + (Integer.parseInt(a.split(",")[1].split(":")[1]));
			
			int time = end - start;
			
			Pattern p = Pattern.compile("[A-Z]#?");
			Matcher mat = p.matcher(music);
			
			List<String> read = new ArrayList<String>();
			while(mat.find()) {
				read.add(mat.group());
			}
			
			if(time > read.size()) {
				while(read.size() < time) {
					read.addAll(read);
				}
				
				while(read.size() > time) {
					read.remove(read.size() -1);
				}
			} else {
				while(read.size() > time ) {
					read.remove(read.size() - 1);
				}
			}
			
			mat = p.matcher(m);
			
			List<String> listen = new ArrayList<String>();
			while(mat.find()) {
				listen.add(mat.group());
			}
			
			
			int idx = read.indexOf(listen.get(0));
			
			for(int i=0; i<idx; i++) {
				read.remove(0);
			}
			
			if(idx != -1) {
				for(int i=1; i<listen.size(); i++) {
					idx = read.indexOf(listen.get(i));
					if(idx == -1) {
						break;
					}
					read.remove(0);
				}
			}
			
			if(idx != -1) {
				answer = answerTime < time ? a.split(",")[2] : answer.equals("(None)") ? a.split(",")[2] : answer;
				answerTime = time;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws ParseException {
		String[] m = {"ABCDEFG", "CC#BCC#BCC#BCC#B", "ABC", "ABC"};
		List<String[]> musicinfos = new ArrayList<String[]>();
		String[] a1 = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		String[] a2 = {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"};
		String[] a3 = {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"};
		musicinfos.add(a1);
		musicinfos.add(a2);
		musicinfos.add(a3);
		
		for(int i=0; i<musicinfos.size(); i++) {
			System.out.println(solution(m[i], musicinfos.get(i)));
		}
		
		// 7, 9, 18, 24, 29
	}

}
