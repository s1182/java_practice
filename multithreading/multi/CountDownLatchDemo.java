package multi;

import java.util.concurrent.CountDownLatch; 

public class CountDownLatchDemo {
	
  public static void main(String args[]) { 
    CountDownLatch cdl = new CountDownLatch(5); 
 
    System.out.println("Starting"); 
 
    new MyThreadSample(cdl); 
 
    try { 
      cdl.await(); 
    } catch (InterruptedException exc) { 
      System.out.println(exc); 
    } 
 
    System.out.println("Done"); 
  } 
} 
 
class MyThreadSample implements Runnable { 
  CountDownLatch latch; 
 
  MyThreadSample(CountDownLatch c) { 
    latch = c; 
    new Thread(this).start(); 
  } 
 
  public void run() { 
    for(int i = 0; i<5; i++) { 
      System.out.println(i); 
      latch.countDown(); // decrement count 
    } 
  } 
}

