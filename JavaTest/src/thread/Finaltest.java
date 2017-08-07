package thread;

public class Finaltest {
/**
 * 此變數是基本型別(primitive type)，表示其值在初始化後便不能再被修改了；
 * 而若此變數是物件變數，則表示此變數的reference不能再被修改，但要注意的是reference所指向的物件其內容仍然是可以被更動的
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final FinalString fs = new FinalString("1");
		 System.out.println(fs.getStr());
		          fs.setStr("2");
		          System.out.println(fs.getStr());
		          fs.setStr("3");
		          System.out.println(fs.getStr());
		 final String aa="BB";
		 System.out.println(aa);
	}

}
