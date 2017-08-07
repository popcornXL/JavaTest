package thread;

public class ThreadDomain32 {
	public static void main(String[] args) {
		    Object lock = new Object();
		    MyThread32 mt0 = new MyThread32(lock);
		    mt0.start();
		    MyThread32_1 mt1 = new MyThread32_1(lock);
		    mt1.start();
		    MyThread32_1 mt2 = new MyThread32_1(lock);
		    mt2.start();
	}
	
	
	public void wait_method(Object lock)
	{
		
		try {
			synchronized(lock)
			{
			System.out.println("Begin wait(), ThreadName = " + Thread.currentThread().getName());
			lock.wait();
			System.out.println("End wait(), ThreadName = " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void notify_method(Object lock)
	{
		 try
	        {
		synchronized(lock)
		{
		System.out.println("Begin notify(), ThreadName = " + Thread.currentThread().getName());
		lock.notify();
		Thread.sleep(5000);
		System.out.println("End notify(), ThreadName = " + Thread.currentThread().getName());
		}
	        }
	        catch (InterruptedException e)
	        {
	            e.printStackTrace();
	        }
	}
}
