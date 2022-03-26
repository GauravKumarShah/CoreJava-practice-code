import java.util.*;
class Question
{
	public static void main(String []args)
	{
	String Question= "What is the largest planet in our solar system?";
	String choiceOne = "earth";
	String choiceTwo = "jupiter";
	String choiceThree  = "saturn";
	String correctAnwser = choiceTwo;	
	System.out.println(Question);
	System.out.println("Choose one of the following: " + choiceOne +" , " + choiceTwo+ " , " + choiceThree + ".");
	Scanner scan = new Scanner(System.in);
	String input = scan.next();

	if(correctAnwser.equals(input.toLowerCase())){
	System.out.println("Congats!");
	}
	else{
	System.out.println("You are is incorrect. The correct answer is " + correctAnwser);
		}}
}