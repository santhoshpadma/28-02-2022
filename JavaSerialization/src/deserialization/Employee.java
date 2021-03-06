package deserialization;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Employee implements Serializable
{
	
	public int id;
	public String Name;
	public double salary;
	
	
	public Employee(int id, String Name, double salary){
		this.id=id;
		this.Name=Name;
		this.salary=salary;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fin= new FileInputStream("E:\\Santhosh_M\\Full-Stack-Smpli\\Java-Application\\emp.txt");
		ObjectInputStream oin= new ObjectInputStream(fin);
		
		Employee ede=(Employee)oin.readObject();
		System.out.println("Employee ID="+ede.id);
		
		oin.close();

	}

}
