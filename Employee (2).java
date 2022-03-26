package javaclass;
import java.io.*;
public class Employee implements Serializable
{


public Employee()
{
}
 	private int id;
	private String name;
	public void setId(int id)
	{
	this.id=id;
	}
	public int getId()
	{
	return id;
	}
	public void setName(String name)
	{
	this.name = name;
	}
	public String getName()
	{
	return name;
	}
}
