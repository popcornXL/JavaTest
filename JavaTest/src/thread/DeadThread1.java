package thread;

public class DeadThread1 extends Thread
{
    private DeadLock dl;
    
    public DeadThread1(DeadLock dl)
    {
        this.dl = dl;
    }
    
    public void run()
    {
        try
        {
            dl.rightLeft();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
