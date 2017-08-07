package thread;

public class MyThread32_1 extends Thread{
	private Object lock;
	
	public MyThread32_1(Object lock)
	{
		this.lock=lock;
	}
	public void run()
	{
		ThreadDomain32 td32=new ThreadDomain32();
		td32.notify_method(lock);
	}
}
