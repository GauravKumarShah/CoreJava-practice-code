public class Plus 
{
	public static void main(String []gaurav)
	{
	// size of plus, use odd number
	int size = 6;
	int alphaH = 65; // alphabet horizontal
	int alphaV = 65; // alphabet vertical
	
		for(int i = 0;i <size; i++)
		{
			for(int j = 0; j < size; j++)
			{
			//print only stars in middle raw
				if(i == size/ 2)
				{
				System.out.print((char)(alphaH + j));
				}
				// other than middle row, print alphabets only at index size/2;
				else
				{
					if(j == size / 2)
					{
					System.out.print((char)(alphaV + i));
					}
					else
					{
					System.out.print(" ");
					}
				}
				if(i == size / 2)
				{
				alphaV++;
				}
				System.out.println();
		}				
	}
}