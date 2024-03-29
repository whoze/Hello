/**
 * 
 */
package _Java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author whoze
 *
 */
public class Snippet {
	public static void main(String[] args) {
	
	    Calendar start = Calendar.getInstance();
	    start.set(2014, 5, 11);
	    Long startTIme = start.getTimeInMillis();
	
	    Calendar end = Calendar.getInstance();
	    end.set(2014, 7, 11);
	    Long endTime = end.getTimeInMillis();
	
	    Long oneDay = 1000 * 60 * 60 * 24l;
	
	    Long time = startTIme;
	    while (time <= endTime) {
	        Date d = new Date(time);
	        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        System.out.println(df.format(d));
	        time += oneDay;
	    }
	}
}

