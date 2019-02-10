
public class Sender implements Runnable{ 
	Warehouse packageName;
	
	Sender(Warehouse packageName)
	{
		this.packageName = packageName;
		new Thread(this, "Send").start();
	}
	@Override
	public void run() {
		packageName.Send();
	}

}
