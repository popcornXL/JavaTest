package thread;

/**
 * 
 * 被volatile修飾的變數，保證了每次讀取到的都是最新的值
 * Thread-safe圍繞的是可見性和原子性，volatile解決的事可見性，但不保證原子性。
 *
 */

public class volatile_Counter {
	    public volatile int inc = 0;
	     
	    public void increase() {
	        inc++;
	    }
	    public static void main(String[] args) {
	        final volatile_Counter test = new volatile_Counter();
	        for(int i=0;i<10;i++){
	            new Thread(){
	                public void run() {
	                    for(int j=0;j<1000;j++)
	                        test.increase();
	                };
	            }.start();
	        }
	         
	        while(Thread.activeCount()>1)  //保證前面的Thread跑完
	            Thread.yield();
	        System.out.println(test.inc);
	    }
	}
