import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			long epoch = new java.text.SimpleDateFormat ("yyyy/MM/dd HH:mm:ss").parse("2016/12/28 13:00:00").getTime()/1000;
			System.out.println(epoch);
		 } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
