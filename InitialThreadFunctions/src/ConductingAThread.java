
public class ConductingAThread {

	public static void main(String[] args) {

		new RunnableInterfaceExcercises();
		
		try
		{
			for(int i = 0; i<10; i++)
			{
				System.out.println("The main Thread" + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("The main Thread has been interrupted");			
		}

	}

}
