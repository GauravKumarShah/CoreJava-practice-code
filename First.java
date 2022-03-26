import java.awt.*;  
class First extends Frame
{  
First()
{  
Button b=new Button("Dear to toch me");  
b.setBounds(100,100,100,10); 
add(b);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String []args)
{ 
First f = new First();   
}
}  