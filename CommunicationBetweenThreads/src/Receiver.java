
public class Receiver implements Runnable{
	Warehouse packageName;
	
	Receiver(Warehouse packageName)
	{
		this.packageName = packageName;
		new Thread(this, "Receive").start();
	}
	@Override
	public void run() {
		packageName.Receive();
	}

}
