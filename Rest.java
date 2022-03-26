import java.sql.*;
import java.util.*;
class Rest
{	
	/*String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String pass=request.getParameter("pass");
        String email=request.getParameter("email");
        String dob=request.getParameter("dob");
        String phone=request.getParameter("phone");
        String address=request.getParameter("address");*/
	public static void main(String []arrg)
	{
	String fname,lname,pass,email,dob,phone,address;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your FirstName");
	fname=scan.nextLine();
	System.out.println("Enter your LastName");
	lname=scan.nextLine();
	System.out.println("Enter your Password");
	pass=scan.nextLine();
	System.out.println("Enter your Email");
	email=scan.nextLine();
	System.out.println("Enter your Date of Birth");
	dob=scan.nextLine();
	System.out.println("Enter your Phone");
	phone=scan.nextLine();
	System.out.println("Enter your Address");
	address=scan.nextLine();
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
        PreparedStatement ps =con.prepareStatement("insert into Register1 values(?,?,?,?,?,?,?)");
        ps.setString(1,fname);
        ps.setString(2,lname);
        ps.setString(3,pass);
        ps.setString(4,email);
        ps.setString(5,dob);
        ps.setString(6,phone);
        ps.setString(7,address);
        ps.executeUpdate();
        if(ps!= null){
            System.out.println("Data Enter!!!!!!");
        }
        else{
            System.out.println("Data Didn't Enter");
        }
                }
		catch(Exception e)
	{
		System.out.print(e);
		e.printStackTrace();
		}
	}
}