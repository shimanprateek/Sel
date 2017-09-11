
import java.util.Scanner;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Prat {

	@Test(dataProvider = "Prateek1",dataProviderClass=Simpletestfactory.class)
	public void maincase(String args[]) {
		// TODO Auto-generated method stub
		//String arg[] = args.split(",");
//		for (Object s: args)
//		{
//			System.out.println(s.toString());
//		}
		System.out.println("-----Prat-----");
		System.out.println(args[0].toString());
		System.out.println(args[1].toString());
		System.out.println(args[2].toString());
		//System.out.println(args[3].toString());
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year = s.nextInt();
		System.out.println("Enter Month : ");
		int month = s.nextInt();
		Prat p = new Prat();
		int x = p.getyearleap(year);
		p.getdays(month, x);
		s.close();
	}
	


	public int getyearleap(int year)
	{
		int x=0;
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		{
			System.out.println("Year " + year + " is a leap year");
			return x= x+1;

			//break;
		}
		else
		{
			System.out.println("Year " + year + " is not a leap year");
			return x;}
	}

	public void getdays(int month ,int yeartype)
	{
		if (yeartype == 1) 
		{
			String monthString;
			switch (month) {
			case 1:  monthString = "January";
			GetMessagedays(1,monthString);
			break;
			case 2:  monthString = "February";
			GetMessageLeapdays(yeartype,monthString);
			break;
			case 3:  monthString = "March";
			GetMessagedays(1,monthString);
			break;
			case 4:  monthString = "April";
			GetMessagedays(0,monthString);
			break;
			case 5:  monthString = "May";
			GetMessagedays(1,monthString);
			break;
			case 6:  monthString = "June";
			GetMessagedays(0,monthString);
			break;
			case 7:  monthString = "July";
			GetMessagedays(1,monthString);
			break;
			case 8:  monthString = "August";
			GetMessagedays(1,monthString);
			break;
			case 9:  monthString = "September";
			GetMessagedays(0,monthString);
			break;
			case 10: monthString = "October";
			GetMessagedays(1,monthString);
			break;
			case 11: monthString = "November";
			GetMessagedays(0,monthString);
			break;
			case 12: monthString = "December";
			GetMessagedays(1,monthString);
			break;
			default: monthString = "Invalid month";
			System.out.println(monthString);
			break;
			}
			//System.out.println(monthString);

		}else
		{
			String monthString;
			switch (month) {
			case 1:  monthString = "January";
			GetMessagedays(1,monthString);
			break;
			case 2:  monthString = "February";
			GetMessageLeapdays(yeartype,monthString);
			break;
			case 3:  monthString = "March";
			GetMessagedays(1,monthString);
			break;
			case 4:  monthString = "April";
			GetMessagedays(0,monthString);
			break;
			case 5:  monthString = "May";
			GetMessagedays(1,monthString);
			break;
			case 6:  monthString = "June";
			GetMessagedays(0,monthString);
			break;
			case 7:  monthString = "July";
			GetMessagedays(1,monthString);
			break;
			case 8:  monthString = "August";
			GetMessagedays(1,monthString);
			break;
			case 9:  monthString = "September";
			GetMessagedays(0,monthString);
			break;
			case 10: monthString = "October";
			GetMessagedays(1,monthString);
			break;
			case 11: monthString = "November";
			GetMessagedays(0,monthString);
			break;
			case 12: monthString = "December";
			GetMessagedays(1,monthString);
			break;
			default: monthString = "Invalid month";
			System.out.println(monthString);
			break;
			}
			
		}
	}


	public void GetMessageLeapdays(int Leap,String Monthname)
	{

		if(Leap == 1)
		{
			System.out.println(Monthname+ " " + "has 29 Days");
		}
		else
		{
			System.out.println(Monthname+ " " + "has 28 Days");
		}

	}

	public void GetMessagedays(int Leap,String Monthname)
	{

		if(Leap == 1)
		{
			System.out.println(Monthname+ " " + "has 31 Days");
		}
		else
		{
			System.out.println(Monthname+ " " + "has 30 Days");
		}

	}
}



