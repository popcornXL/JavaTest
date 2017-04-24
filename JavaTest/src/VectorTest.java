import java.util.LinkedList;
import java.util.List;

public class VectorTest {
	public static void main(String[] args) {
		  int aa []={2, 7, 11, 15};  //index1=1, index2=2
		  int target=0;
		  int bb []={2,7,11,15,55};
		  for(int a : aa) 
		  {
			  target ^=a;  
		  }
		  for(int a : bb)
			  {
			  target ^=a;
			  }
		  System.out.println("結果"+target);
		  String jj= "abcd";
		  for(int i=0;i<jj.length();i++)
		  {
			  System.out.println(jj.charAt(i));
		  }
	}
		public static char findTheDifference(String s, String t){
			char res=0;
			return res;
    }
}
