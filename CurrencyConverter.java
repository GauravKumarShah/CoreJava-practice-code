import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter
{
	public static void main(String []args)
	{
	double amount, dollar, pound, code, euro, yen, ringgit, rupee;
	
	DecimalFormat f= new DecimalFormat("##,##");
	
	Scanner scan=new Scanner(System.in);
		
	System.out.println("hi, Welcome to the Currency Converter!");
	
	System.out.println("Which currency You want to Convert ?");
	System.out.println("\n\t1 : Rupee \n\t2 : Dollar \n\t3 : Pound  \n\t4 : Euro  \n\t5 : Yen  \n\t6 : Ringgit");	
	code= scan.nextInt();

	System.out.println("How much Money you want to convert ?");
	amount= scan.nextFloat();
	if(code==1)
	{	
		dollar = amount/74.42;
		System.out.println(" Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
		
		pound=amount/102.8;
		System.out.println(" Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

		euro=amount/87.80;
		System.out.println(" Your " + amount + " Rupee is :" + f.format(euro) + " Euro");

		yen=amount/0.67;
		System.out.println(" Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
		
		ringgit=amount/17.66;
		System.out.println(" Your " + amount + " Rupee is :" + f.format(ringgit) + " Ringgit");
	}
}
	
}