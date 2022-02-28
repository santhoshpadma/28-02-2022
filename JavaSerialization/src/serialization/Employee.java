package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Employee 
{
	
	public int id;
	public String Name;
	public double salary;
	
	
	public Employee(int id, String Name, double salary){
		this.id=id;
		this.Name=Name;
		this.salary=salary;
	}

	public static void main(String[] args) throws IOException {
		
		Employee em=new Employee(1,"San",23000.5);
		
		FileOutputStream fout= new FileOutputStream("E:\\Santhosh_M\\Full-Stack-Smpli\\Java-Application\\emp.txt");
		ObjectOutputStream objOut = new ObjectOutputStream(fout);
		objOut.writeObject(em);

	}

}
