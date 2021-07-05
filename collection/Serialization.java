package collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;


@SuppressWarnings("serial")
class empl implements  Serializable    //have to implement serializable interface in order to use serilization 
{
	int id;
	String name;
	public empl(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
		
}


class s1 
{

	void serial() throws IOException   //throws keyword ignores the exception when rises or tells exception will come
	{
		empl e =new empl(1,"pratik");
		
		FileOutputStream fos =new FileOutputStream("serializefile.txt");  //takes filename in constructor
		ObjectOutputStream oss = new ObjectOutputStream(fos);   //takes fileoutputstram object in cons 
		
		oss.writeObject(e); //method takes class object to write data in the file in encrypted format
		
		System.out.println("serialization completed "); 
		
		oss.close();  //close the resource
		
		
		
	}
	
	
	void deserial() throws IOException, ClassNotFoundException   //instead of writing throws you can also write try-catch block around the code
	{
		
		
		FileInputStream fis = new FileInputStream("serializefile.txt");  //takes file name in cons
		
		ObjectInputStream ois  =new ObjectInputStream(fis);  //takes fileinputstream obj in cons
		
		 empl e =  (empl)ois.readObject();  //readobject read from file and return the object in the file we have to type cast in that object format 
		 
		
			 System.out.println(e.id+" "+ e.name);
		
		 ois.close();
		
		
	}
	
	
}



public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {   //exception will generate so that we have to mention that exceptions
		
		
		 s1 l = new s1();
		 l.serial();
		 l.deserial();
		
		

	}

}
