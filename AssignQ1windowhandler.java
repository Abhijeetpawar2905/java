/*public interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
public interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}

public class WindowGUIApp implements MouseHandler,WindowHandler
{
}
public class GUIDemo
{
	main()
	{
		create the object of WindowGUIApp and invoke all the methods
	}
}
*/

package DAY_6;
 interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
 interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}
class WindowGUIApp implements MouseHandler,WindowHandler
{
	public void mouseClicked()
	{
		System.out.println("Windows mouse is Clicked ....");
	}
	public void mousePressed()
	{
		System.out.println("Windows mouse is Pressed ....");
	}
	public void mouseReleased()
	{
		System.out.println("Windows mouse is Released ....");
	}
	public void windowClosing()
	{
		System.out.println("Windows  is Closing ....");
	}
	public void windowClosed()
	{
		System.out.println("Windows  is Closed ....");
	}
}

public class AssignQ1windowhandler {

	public static void main(String[] args) {
		
		WindowGUIApp w = new WindowGUIApp();
		w.mouseClicked();
		w.mousePressed();
		w.mouseReleased();
		w.windowClosed();
		w.windowClosing();
	}
}
