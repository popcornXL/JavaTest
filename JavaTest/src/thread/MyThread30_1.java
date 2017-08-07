package thread;

public class MyThread30_1 extends Thread{
	
	private Object lock;
	
	public MyThread30_1(Object lock)
	{
		this.lock=lock;
	}
	
	public void run()
	{
			 synchronized(lock)
			 {
			 System.out.println("開始------notify time = " + System.currentTimeMillis());
			 lock.notify();
			 System.out.println("結束------notify time = " + System.currentTimeMillis());
			 }
	}

}
