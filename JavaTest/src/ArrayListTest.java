import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class ArrayListTest {
	public static void main(String args[])
	{
//		ArrayList<String> list = new ArrayList<>();
//		list.add("4");
//		list.add("3");
//		list.add("2");
//		list.add("1");
//		list.add(0,"5");
//		for(int i=0;i<list.size();i++)
//		{
//		System.out.println("list is "+list.get(i));
//		}
//		list.remove(1);
//		System.out.println(list.size());
//		System.out.println(list.contains("4"));
//
//		String[] arr = (String[])list.toArray(new String[0]);
//		for(String str:arr)
//		{
//			System.out.println("str:"+str);
//		}
//	   // list.clear();
//	    System.out.println(list.isEmpty());
//	    String path2="C:\\DocumentsandSettings\\Leeo\\MyDocuments\\logo.gif";
//	    String temp[] = path2.replaceAll("\\\\","/").split("/");
//	    String fileName = "";
//	    if(temp.length > 1){
//	        fileName = temp[temp.length - 1];
//	    }
//	    System.out.println("fileName:"+fileName);
		  List<Integer> yyyymm = new ArrayList<Integer>();
			Calendar cal = Calendar.getInstance();
			yyyymm.add(Integer.valueOf(cal.get(Calendar.YEAR) * 100
					+ cal.get(Calendar.MONTH) + 1));
			int ss=yyyymm.get(0);
			String aa=Integer.toString(ss);
			aa = aa.substring(0, 4) + "-" + aa.substring(4, aa.length());
//			for (int i = 0; i < 12; i++) {
//				cal.add(Calendar.MONTH, -1);
//				yyyymm.add(Integer.valueOf(cal.get(Calendar.YEAR) * 100
//						+ cal.get(Calendar.MONTH) + 1));
//			}
			System.out.println(aa);
			System.out.println(yyyymm);
	}
}
