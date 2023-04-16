package sample4_static;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
	
	static String dateToString(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String text = sdf.format(new Date());
		return text;
		
	}

}
