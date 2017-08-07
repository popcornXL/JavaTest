package thread;

public class MyThread33 extends Thread{
	private Object lock;
	public MyThread33(Object lock)
	{
		this.lock=lock;
	}
	public void run()
	{
		ThreadDomain33 td33=new ThreadDomain33();
		td33.preload(lock);
	}
}