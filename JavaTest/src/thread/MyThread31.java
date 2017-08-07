package thread;

public class MyThread31 extends Thread{
	private Object lock;
	
	public MyThread31(Object lock){
		this.lock=lock;
	}
	public void run(){
		ThreadDomain31 td31=new ThreadDomain31();
		td31.wait_Thread(lock);
	}
}
