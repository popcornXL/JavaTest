package thread;

public class DeadThread0 extends Thread
{
    private DeadLock dl;
    
    public DeadThread0(DeadLock dl)
    {
        this.dl = dl;
    }
    
    public void run()
    {
        try
        {
            dl.leftRight();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
