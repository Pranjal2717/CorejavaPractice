//importing packages
import java.util.Scanner;

//creating class
class SwitchEnhance2
{
	//Method for Tagline
	static void PrintTagline(String BrandName)
	{
		//Switch case
		switch(BrandName)
		{
			case "ADIDAS": System.out.println("Impossible is nothing");
			break;
			case "NIKE": System.out.println("JUST DO IT");
			break;
			case "PUMA": System.out.println("FOREVER FASTER");
			break;
			case "ONITSUKA TIGER": System.out.println("SOUND MIND, SOUND BODY");
			break;
			case "FILA": System.out.println("ONE WORLD, ONE FILA");
			break;
			
		}
	}
	
	//main
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Brand Name: ");
		String BrandName= sc.next().toUpperCase();
		PrintTagline(BrandName);
		
	}
	
	
}