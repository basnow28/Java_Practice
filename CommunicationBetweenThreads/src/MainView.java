
public class MainView {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			Warehouse newPackage = new Warehouse(i);
			new Sender(newPackage);
			new Receiver(newPackage);
		}
	}

}
