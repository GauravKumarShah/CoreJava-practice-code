import java.util.Scanner;
public class ATMExample extends Thread
{
	public static void main(String []arg)
	{
	try{
	int balance=100000, withdraw, deposit;
	Scanner scan=new Scanner(System.in);
	
		while(true)
		{

		System.out.println("Automated Teller Machine");
		Thread.sleep(2000);
		System.out.println("Plase Enter your ATM card");
		Thread.sleep(3000);
		System.out.println("Enter your Pin");
		int i=scan.nextInt();
		Thread.sleep(3000);
		System.out.println("Choose 1 for Withdraw");
		System.out.println("Choose 2 for Deposit");
		System.out.println("Choose 3 for Check Balance");
		System.out.println("Choose 4 for Exit");
		System.out.println("Choose the operation you want to perform:");
	
		int choice =scan.nextInt();
		switch(choice)
		{
			case 1:
			System.out.println("Enter money to be withdraw");
			withdraw=scan.nextInt();
			
				if(balance>=withdraw)
				{
					balance=balance-withdraw;
					
					System.out.println("Please collect the money");
				}
				else
				{
					System.out.println("Insufficient Balance");
				}
				
				System.out.println("");
				System.exit(0);				
			case 2:
			System.out.println("Enter money to deposit:");
			
			deposit=scan.nextInt();
		
			balance=balance+deposit;
			System.out.println("Your Money has been successfully deposited");
			System.out.println("");	
			System.exit(0);

			case 3:
			System.out.println("Balance : "+balance);
			System.out.println("");
			System.exit(0);
		
			case 4:
			System.exit(0);
			}
		
		}
	}
	catch(Exception e){
	}
	}

}