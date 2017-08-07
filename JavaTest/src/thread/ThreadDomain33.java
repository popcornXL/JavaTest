package thread;

public class ThreadDomain33 {
	
	public void preload(Object lock)
	{
		try {
			synchronized(lock)
			{
			System.out.println("Begin wait()");
			lock.wait();
			System.out.println("End wait()");
			}
		} catch (InterruptedException e) {
			System.out.println("wait()被interrupt()打斷了！");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Object lock = new Object();
		MyThread33 md33=new MyThread33(lock);
		md33.start();
		try {
			Thread.sleep(3000);
			md33.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
