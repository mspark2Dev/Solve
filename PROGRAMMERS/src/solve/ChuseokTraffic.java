package solve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ChuseokTraffic {

	public static int solution(String[] lines) throws ParseException {
		int answer = 0;
		
		List<Calendar> ends = new ArrayList<Calendar>();
		List<Double> times = new ArrayList<Double>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		for(String l : lines) {
			Date d = sdf.parse(l.substring(0, l.lastIndexOf(" ")));
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(d.getTime());
			ends.add(cal);
			
			times.add(Double.parseDouble(l.substring(l.lastIndexOf(" ") + 1, l.length() - 1)));
		}
		
		System.out.println(ends.get(0).getTime());
		System.out.println(times.get(0));
		
		return answer;
	}

	public static void main(String[] args) throws ParseException {
		List<String[]> lines = new ArrayList<String[]>();
		lines.add(("2016-09-15 01:00:04.001 2.0s,2016-09-15 01:00:07.000 2s").split(","));
		lines.add(("2016-09-15 01:00:04.002 2.0s,2016-09-15 01:00:07.000 2s").split(","));
		lines.add(
				("2016-09-15 20:59:57.421 0.351s,2016-09-15 20:59:58.233 1.181s,2016-09-15 20:59:58.299 0.8s,2016-09-15 20:59:58.688 1.041s,2016-09-15 20:59:59.591 1.412s,2016-09-15 21:00:00.464 1.466s,2016-09-15 21:00:00.741 1.581s,2016-09-15 21:00:00.748 2.31s,2016-09-15 21:00:00.966 0.381s,2016-09-15 21:00:02.066 2.62s")
						.split(","));
		
		for(String[] a : lines) {
			System.out.println(solution(a));
		}
	}

}
