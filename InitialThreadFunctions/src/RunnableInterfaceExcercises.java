
public class RunnableInterfaceExcercises implements Runnable{
	
	Thread t;
	
	RunnableInterfaceExcercises()
	{
		t = new Thread(this, "New Thread");
		t.start();
	}
	
	public void run() {
		try {
			for(int i=0; i<10; i++)
			{
				System.out.println("New Thread" + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e )
		{
			System.out.println("The Thread has been interrupted");
		}
	}
	

}
