public class X
{
	public static void main(String []args)
	{
	//size of cross, use odd number
	int size = 5;
	int alpha = 65;
	
		for(int i = 0;i<size; i++)
		{
			for(int j= 0; j <size;j++)
			{
				if(i == j || i + j == size - 1)
				{
				System.out.print((char)(alpha + j));
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}