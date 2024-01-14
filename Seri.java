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
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	
}
public class Seri {
	
	public static void main(String[] args) {
		
		List<Student>myList = new ArrayList<>();
		Student s1 = new Student();
		s1.setAge(20);
		s1.setName("Abhi");
		
		Student s2 = new Student();
		s2.setAge(23);
		s2.setName("Abhijeet");
		
		myList.add(s1);
		myList.add(s2);
		
		try
		{
			FileOutputStream f= new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\java\\abc.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(myList);
			
			FileInputStream f1= new FileInputStream ("C:\\\\Users\\\\Asus\\\\OneDrive\\\\Desktop\\\\java\\\\abc.txt");
			ObjectInputStream o1= new ObjectInputStream(f1);
			
			List<?> ref = null;
			
			ref=(List<?>)o1.readObject();
			
			Iterator<?> itr = ref.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}
