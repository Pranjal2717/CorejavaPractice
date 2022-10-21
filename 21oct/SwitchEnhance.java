//importing packages
import java.util.Scanner;

//creating class
class SwitchEnhance
{
	//Method for abbr
	static void PrintAbbr(String abbr)
	{
		//Switch case
		switch(abbr)
		{
			case "lol": System.out.println("Lots of laugh");
			break;
			case "asap": System.out.println("As soon as possible");
			break;
			case "ttyl": System.out.println("Talk to you later");
			break;
			
		}
	}
	
	//main
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Abbr: ");
		String abbr= sc.next().toLowerCase();
		PrintAbbr(abbr);
		
	}
	
	
}