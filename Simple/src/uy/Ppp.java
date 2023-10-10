package uy;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class Ppp {
	public static void main(String[]args) {
		 try
		 {
			 FileWriter obj = new FileWriter("C:/Users/91965/Desktop/python/new.txt");
			 obj.write("gdugfyuf");
			 obj.close();
			 System.out.println("gchjvh");
			 
			 
		 }catch(FileNotFoundException e) {
	System.out.println("not found");
	e.printStackTrace();
}
	}
}