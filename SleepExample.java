class SleepExample extends Thread
{

public static void main(String []args) 
{
Thread t = new Thread(new SleepExample());
System.out.println(t.currentThread().getName());
t.start();
}
public void run()
{
System.out.println(Thread.currentThread().getName()); 	
}
}