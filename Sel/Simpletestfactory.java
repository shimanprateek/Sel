
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;


public class Simpletestfactory {
	
	@BeforeTest
	@DataProvider(name = "Prateek1")
	public static Object[][] PassValues() {
		//String [] args = new String[];
		//String s  = "One"+","+"Two"+","+"Three";
		String []s = {"four","five","Six"}; //utilize datasheet here
		return new Object[][]  {{s}};
		
	}
		//@Test
		@Factory
		public Object[] factoryMethod() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//			String  s = "new Prat(),new Prat1()";
//			String arr[] = s.split(",");
//			//Object [] s = {"new Prat()"};
//			ArrayList <Object> l = new ArrayList <Object> (Arrays.asList(arr));
			Object [] a =getclassRuntime().toArray(new Object[getclassRuntime().size()]);
			return a;
			//return getclassRuntime().toArray();
			
		}
		
		public ArrayList<Object> getclassRuntime() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			String  s = "Suhit,Prat,Prat1,abc,Abds";  //utilize class parameter here
			String arr[] = s.split(",");
			ArrayList <Object> l = new ArrayList<Object>();
			for (String x :arr)
			{
				Class <?> c = Class.forName(x);
				Object o = c.newInstance();
				l.add(o);
			}
			return l;
		}
}
