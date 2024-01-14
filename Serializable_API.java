/*class Student implements Serializable
	rollno
	name

create 2 objects of Student , store them inside ArrayList and store that ArrayList inside the file.

now read from file , the ArrayList and traverse it using Iterator
*/
package DAY_13;

import java.util.*;
import java.io.*;

class Student implements Serializable
{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
		
}
public class Serializable_API {

	public static void main(String[] args) {
		
		List<Student>MyList = new ArrayList<Student>();
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Abhi");
		s1.setRollno(2);
		s2.setName("abhi1");
		s2.setRollno(63);
		
		MyList.add(s1);
		MyList.add(s2);
		
		FileOutputStream fos=null;
		FileInputStream fis=null;
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		
		try {
			fos=new fileOutputStream()
		}
		
	}
	
}
