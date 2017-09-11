import org.testng.annotations.Test;


public class abc {
@Test(dataProvider = "Prateek1",dataProviderClass=Simpletestfactory.class)
	public void maincase(String args[]) {
		// TODO Auto-generated method stub
		//String arg[] = args.split(",");
//		for (Object s: args)
//		{
//			System.out.println(s.toString());
//		}
		System.out.println("-----abc-----");
	System.out.println(args[0].toString());
		System.out.println(args[1].toString());
		System.out.println(args[2].toString());
		//System.out.println(args[3].toString());
	}
	
}
