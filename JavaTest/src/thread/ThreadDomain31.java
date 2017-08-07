package thread;

public class ThreadDomain31 {

	public static void main(String[] args) {
		Object lock = new Object();
	    MyThread31 mt0 = new MyThread31(lock);
	    MyThread31 mt1 = new MyThread31(lock);
	    mt0.start();
	    mt1.start();
	}
	public void wait_Thread(Object lock)
	{
	    synchronized(lock)
	    {
		try {
			  System.out.println("Begin wait(), ThreadName = " + Thread.currentThread().getName());
			  lock.wait();
			  System.out.println("End wait(), ThreadName = " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    }
	}
}
