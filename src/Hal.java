
/*********************************************************
// Class: Example
//
// Purpose:
//   What this class does.
//
// Notes:     Any special notes for users of the class.
//
// Programmer: Joe Smith
// Creation: August 29, 2007
//
// Modifications:
//   Joe Smith, Fri Oct 15 13:31:51 EST 2007
//   I added a new method to do ...
//
// *********************************************************/
import java. awt.*;
import java.util.*;

public class Hal {

	public static void main(String[] args) throws AWTException
	{
		// TODO Auto-generated method stub
		
        System.out.println("Siuuu!!");
        System.out.println("Demo!");
        Robot hal = new Robot();
        Random random = new Random();
        int c=0;
		while(true)
		{
		hal.delay(1000 * 60);
		c++;
		int x = random.nextInt() % 640;
		int y = random.nextInt() % 480;
		hal.mouseMove(x,y);
		System.out.println("--> "+c);
		}

	}
 
}
