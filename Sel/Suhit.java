import org.testng.annotations.Test;


public class Suhit {
	@Test(dataProvider = "Prateek1",dataProviderClass=Simpletestfactory.class)
	public void maincase(String args[])
	{
		System.out.println("-----Suhit-----");
		System.out.println(args[0].toString());
		
		
	}
}
