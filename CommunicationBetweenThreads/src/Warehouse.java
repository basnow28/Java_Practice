
public class Warehouse {
	int packageNumber;
	boolean isThereANewPackage = false;
	
	Warehouse(int packageNumber)
	{
		this.packageNumber = packageNumber;
	}
	
	synchronized void Send()
	{
		if(isThereANewPackage)
		try{
			wait();
		}catch(InterruptedException e)
		{
			System.out.println("Error in a Warehouse");
		}
		
		System.out.println("The package has been sent: " + packageNumber);
		isThereANewPackage = true;
		notify();
	}
	
	synchronized int Receive()
	{
		if(!isThereANewPackage)
		try{
			wait();
		}catch(InterruptedException e)
		{
			System.out.println("Error in a Warehouse");
		}
		
		System.out.println("The package has been received: " + packageNumber);
		isThereANewPackage = false;
		notify();
		
		return packageNumber;
	}

}
