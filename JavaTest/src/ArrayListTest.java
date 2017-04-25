import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class ArrayListTest {
	public static void main(String args[])
	{
		  List<Integer> yyyymm = new ArrayList<Integer>();
			Calendar cal = Calendar.getInstance();
			yyyymm.add(Integer.valueOf(cal.get(Calendar.YEAR) * 100
					+ cal.get(Calendar.MONTH) + 1));
			int ss=yyyymm.get(0);
			String aa=Integer.toString(ss);
			aa = aa.substring(0, 4) + "-" + aa.substring(4, aa.length());
			System.out.println(aa);
			System.out.println(yyyymm);
			System.out.println("tomgit");
	}
}
