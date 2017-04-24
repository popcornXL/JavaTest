import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 testHashSetAPIs() ;
    }
    private static void testHashSetAPIs() {
         
        HashSet set = new HashSet(); 
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        //��������
        System.out.printf("size : %d\n", set.size());

        //�O�_�]�t�Y��
        System.out.printf("HashSet contains a :%s\n", set.contains("a"));
        System.out.printf("HashSet contains g :%s\n", set.contains("g"));

        //����
        set.remove("e");

        //�Nset�ഫ���Ʋ�
        String[] arr = (String[])set.toArray(new String[0]);
        for (String str:arr)
            System.out.printf("for each : %s\n", str);

        //�s�ؤ@��Hashset
        HashSet otherset = new HashSet();
        otherset.add("b");
        otherset.add("c");
        otherset.add("f");

        //�ƻs�@��set�éR�W��removeset
        HashSet removeset = (HashSet)set.clone();
        
        System.out.println(removeset);
        
        removeset.removeAll(otherset);
        
        System.out.printf("removeset : %s\n", removeset);

        HashSet retainset = (HashSet)set.clone();
        
        retainset.retainAll(otherset);
        
        System.out.printf("retainset : %s\n", retainset);
       
        for(Iterator iterator = set.iterator();
               iterator.hasNext(); ) 
            System.out.printf("iterator : %s\n", iterator.next());
        
        set.clear();
        
        System.out.printf("%s\n", set.isEmpty()?"set is empty":"set is not empty");
	}

}
