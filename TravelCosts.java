import java.util.Scanner;
public class TravelCosts{
	
	public static void main(String []args){
		double distance, mpg, pricePerGallon, totalCost;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total distance in miles: ");
		distance = scan.nextDouble();
		System.out.println("Enter the mpg for the vehicle: ");
		mpg = scan.nextDouble();
		System.out.println("Enter the price of one gallon of gas: ");
		pricePerGallon = scan.nextDouble();
		
		totalCost = (distance/mpg)*pricePerGallon;
	
		System.out.printf("The trip is going to cost $%5.3f", totalCost);
		System.out.println();
}
}