package thread;

public class MyThread32 extends Thread{
	private Object lock;
	
	public MyThread32(Object lock)
	{
		this.lock=lock;
	}
	public void run()
	{
		ThreadDomain32 td32=new ThreadDomain32();
		td32.wait_method(lock);
	}
}
