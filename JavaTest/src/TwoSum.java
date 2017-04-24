import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		 int[] array = new int[]{1,3,4,5,8};  
	        int[] indices = twoSum(array, 9);  
	        System.out.println(indices[0]+"    "+indices[1]);  
	}



public static  int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
}
}