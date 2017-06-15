import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author 831_TomChen
 * @結果為 ArrayList使用普通for迴圈時間為1ms
		 ArrayList使用foreach迴圈時間為2ms
		 LinkedList使用普通for迴圈時間為85ms
         LinkedList使用foreach迴圈時間為1ms
 */
public class LinkedTest {

	private static int SIZE=11111;	
	
	private static void loopList(List<Integer> list)
    {
        
		long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++)
        {
            list.get(i);
        }
        System.out.println(list.getClass().getSimpleName() + "使用普通for迴圈時間為" + 
                (System.currentTimeMillis() - startTime) + "ms");
         
        startTime = System.currentTimeMillis();
        for (Integer i : list)
        {
        	
        }
        System.out.println(list.getClass().getSimpleName() + "使用foreach迴圈時間為" + 
                (System.currentTimeMillis() - startTime) + "ms");
    }
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(SIZE);
		List<Integer> linkedList = new LinkedList<>();
		for(int i = 0 ; i< SIZE; i++)
		{
			arrayList.add(i);
			linkedList.add(i);
		}
		 loopList(arrayList);
	     loopList(linkedList);
	     System.out.println();
	}

}
