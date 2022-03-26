//You need to create a class, ConceptCar, that extends the existing class, BasicCar, and implements the interface, Car and 
//the java.io.Serializable interfaces. For the same, you have created the following class definition.

//public class ConceptCar implements Car, java.io.Serializable extends BasicCar{}

//However, the preceding class definition has as error. Identify the code snippet that will be used to create the ConceptCar 
//class.



import java.io.*;

interface Car{
}
class BasicCar
{
}

public class ConceptCar extends BasicCar implements Car, java.io.Serializable
{
	public static void main(String []args)
	{
	}
}