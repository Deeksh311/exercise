public class DemoThread1 implements Runnable {

	public void run() {
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Running Child Thread in loop " + Thread.currentThread().getName());
			 
			try
			{
			     Thread.sleep(2000);
			 }
			
			 catch(InterruptedException e)
			 {
				 
			 }
		}
		}
	}
