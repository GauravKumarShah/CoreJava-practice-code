class G implements Runnable
{
	public static void main(String []args)
	{
		
	G g = new G();
	Thread t = new Thread(g);
	t.start();
	
	}
	public void run()
		{
			for(int i=0;i<10;i++)
			{
			System.out.println(i);
			}
		}
}		