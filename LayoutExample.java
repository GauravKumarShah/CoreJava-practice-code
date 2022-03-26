import java.awt.*;
import java.awt.event.*;
class LayoutExample
{
	public static void main(String []args)
	{
		Frame f = new Frame("Information Center");
		Label l1 = new Label("Name");
		Label l2 = new Label("Email :");
		Label l3 = new Label("Phone no :");
		Label l4 = new Label("Address");
		final Frame f1= new Frame("PopupMenu Example");  
         final PopupMenu popupmenu = new PopupMenu("Edit");   
         MenuItem cut = new MenuItem("Cut");  
         cut.setActionCommand("Cut");  
         MenuItem copy = new MenuItem("Copy");  
         copy.setActionCommand("Copy");  
         MenuItem paste = new MenuItem("Paste");  
         paste.setActionCommand("Paste");      
         popupmenu.add(cut);  
         popupmenu.add(copy);  
         popupmenu.add(paste);        
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
         f1.add(popupmenu);   
         f1.setSize(400,400);  
         f1.setLayout(null);  
         f1.setVisible(true); 
			f.setVisible(true);
			f.setSize(600,600);
			f.setLayout(null);
			f.setBackground(Color.RED);
			TextField t1 = new TextField();	
			TextField t2 = new TextField();
			TextField t3 = new TextField();
			TextField t4 = new TextField();
			Button btn = new Button("SUBMIT");
			Button btn1 = new Button("CLEAR");
			TextArea ta = new TextArea();
			CheckboxGroup cbg = new CheckboxGroup();
			Checkbox c = new Checkbox("JAVA",cbg,false);
			Checkbox c1 = new Checkbox("C++",cbg,false);
			Checkbox c2 = new Checkbox("C#",cbg,false);
			l1.setBounds(100,150,40,40);
			f.add(l1);
			t1.setBounds(200,150,100,40);
			f.add(t1);
			l2.setBounds(100,200,50,40);
			f.add(l2);
			t2.setBounds(200,200,100,40);
			f.add(t2);
			l3.setBounds(100,250,40,40);
			f.add(l3);
			t3.setBounds(200,250,100,40);
			f.add(t3);
			l4.setBounds(100,300,50,40);
			f.add(l4);
			ta.setBounds(200,300,100,100);
			f.add(ta);
			c.setBounds(50,450,50,20);
			f.add(c);
			c1.setBounds(50,500,50,20);
			f.add(c1);
			c2.setBounds(50,550,50,20);
			f.add(c2);
			btn.setBounds(400,600,55,25);
			f.add(btn);
			btn1.setBounds(500,600,55,25);
			f.add(btn1);
				MenuBar mb1 = new MenuBar();
				Menu menu1 = new Menu("File");
				MenuItem m1 = new MenuItem("New	Ctrl+N");
				MenuItem m2 = new MenuItem("Open...    Ctrl+O");
				MenuItem m3 = new MenuItem("Save	 Ctrl+S");
				menu1.add(m1);
				menu1.add(m2);
				menu1.add(m3);
				mb1.add(menu1);
				f.setMenuBar(mb1);
					  
	}
}
