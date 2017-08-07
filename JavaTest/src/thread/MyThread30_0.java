package thread;

public class MyThread30_0 extends Thread
{
    private Object lock;
    
    public MyThread30_0(Object lock)
    {
        this.lock = lock;
    }
    
    public void run()
    {
        try
        {
            synchronized (lock)
            {
                System.out.println("開始------wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("結束------wait time = " + System.currentTimeMillis());
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
