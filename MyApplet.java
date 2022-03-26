import java.awt.*;
import java.applet.Applet;
import java.util.*;
	
/*<applet code="MyApplet" width="400" height="400">
</applet>*/


public class MyApplet extends Applet implements Runnable{
	Thread t, t1;
	//override start method
	public void start(){
	t=new Thread(this);
	t.start();
	}
	public void run(){
	t1 = Thread.currentThread();
		while(t1 == t){
		repaint();
		try{
			t1.sleep(1000);
		}
		catch(InterruptedException e){}
	}
	}
	public void paint(Graphics g){
	Calendar cal = new GregorianCalendar();
	String hour = String.valueOf(cal.get(Calendar.HOUR));
	String minute = String.valueOf(cal.get(Calendar.MINUTE));
	String second = String.valueOf(cal.get(Calendar.SECOND));
	g.drawString(hour + ":" + minute + ":" +second, 200,200);
	}

}