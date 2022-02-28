package tabels;

import java.util.Scanner;

public class Tabels {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n;
		
		try {
			System.out.println("Enter number :");
			n=Integer.parseInt(s.nextLine());
			
			System.out.println("Tabels for "+n+" is");
			for (int i=1;i<=10;i++) {
				System.out.println(n+" x "+i+" = "+n*i);
			}
			
		}
		catch(NumberFormatException ex) {
			System.out.println("Enter Only Numbers");
			System.out.println(ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		finally {
			s.nextLine();
			s.close();
		
		}
		

	}

}
