package thread;

public class DeadLock {
	private final Object left = new Object();
    private final Object right = new Object();
    
    public void leftRight() throws Exception
    {
        synchronized (left)
        {
            Thread.sleep(2000);
            synchronized (right)
            {
                System.out.println("leftRight end!");
            }
        }
    }
    
    public void rightLeft() throws Exception
    {
        synchronized (right)
        {
            Thread.sleep(2000);
            synchronized (left)
            {
                System.out.println("rightLeft end!");
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    DeadLock dl = new DeadLock();
		    DeadThread0 dt0 = new DeadThread0(dl);
		    DeadThread1 dt1 = new DeadThread1(dl);
		    dt0.start();
		    dt1.start();
//		    while(true);   
	}

}
