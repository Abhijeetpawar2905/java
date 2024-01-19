/*
on Developer side create the following interface
	create necessary jar and docs

public interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
}
create following classes on client side

class FileSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside FileSystem
	}
	public String readData()
	{
		// how to read data from FileSystem
	}
}

class DatabaseSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside DatabaseSystem
	}
	public String readData()
	{
		// how to read data from DatabaseSystem
	}
}

class BigdataSystem implements PersistenceMechanism
{
	public void writeData(String ref)
	{
		// how to write data inside BigdataSystem
	}
	public String readData()
	{
		// how to read data from BigdataSystem
	}
}

create one more class "Demo" and in its main function create array of "PersistenceMechanism" interface, store all the child class objects ,  
traverse the array and invoke only "BigdataSystem" class "writeData" and "readData" methods.*/

package DAY_6;
interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
}
class FileSystem implements PersistenceMechanism
{
	String s;
	public void writeData(String ref)
	{
		this.s=ref;
	}
	public String readData()
	{
		return s;
	}
}
class DatabaseSystem implements PersistenceMechanism
{
	String s;
	public void writeData(String ref)
	{
		this.s=ref;
	}
	public String readData()
	{
		return s;
	}
}
class BigdataSystem implements PersistenceMechanism
{
	String s;
	public void writeData(String ref)
	{
		this.s=ref;
	}
	public String readData()
	{
		return s;
	}
}
public class AssignQ2persistemachanism {
	
public static void main(String[] args) {
	
	 PersistenceMechanism p[] = new  PersistenceMechanism[3];
	 
	 p[0]=new FileSystem();
	 p[1]=new DatabaseSystem();
	 p[2]=new BigdataSystem();
	 
	 for(int i =0; i<3; i++)
	 {
		 if(p[i] instanceof BigdataSystem)
		 {
			 p[i].writeData("Abhijeet pawar");
			 System.out.println("data is :"+p[i].readData());
		 }
	 }
	 
}
}
