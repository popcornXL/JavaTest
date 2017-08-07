package thread;

public class oneThreadTest extends Thread{
	 public void run()
	{
		for(int i =0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"run執行中");
		}
	}
	public static void main(String[] args) {
		oneThreadTest one=new oneThreadTest();
		one.start();
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"main執行中");
		}
	}
}

