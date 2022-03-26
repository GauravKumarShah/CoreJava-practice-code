class CharCheck
{
	public static void main(String []atg)
	{
	char CapitalChar='A';
	char smallChar='a';
	System.out.println("ASCII Value from A to Z");
	for(int i='A'; i<='Z';i++){
	 System.out.println(CapitalChar +" : "+i);
           CapitalChar++;
	}
	
	System.out.println("ASCII Value from a to z");
	for(int j='a' ; j<='z';j++)
	{
	System.out.println(smallChar+" : "+j);
	smallChar++;
	}
	}

}