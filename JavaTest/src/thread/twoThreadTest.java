package thread;

public class twoThreadTest implements Runnable{

	public static void main(String[] args) {
		twoThreadTest two=new twoThreadTest();
		Thread aa=new Thread(two);
		System.out.println("begin"+aa.isAlive());
		aa.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"執行中");
		}
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"執行中");
		}
	}

}
