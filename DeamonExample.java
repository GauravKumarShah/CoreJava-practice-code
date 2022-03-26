class DeamonExample extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().isDaemon());
}
public static void main(String []args)
{
DeamonExample d = new  DeamonExample();
d.setDaemon(true);
d.start();
}

}