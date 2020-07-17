//Make a List of Circle objects. Use a random radius. Keep adding circles to the list until Math.ran-
//dom() returns less than 0.01. Then, loop down the list and print out each area.
package Random;
import java.util.ArrayList;
import java.util.List;


public class Circle {
	
	private static double radius;

	public static void main(String[] args) {
		List<String> c = new ArrayList<String>();
		c.add("c1");
		c.add("c2");
		c.add("c3");
		c.add("c4");
		for (int i = 0; i < c.size(); i++) {
			radius = Math.random();
			double pi = 3.14;
			double Area = pi * radius * radius;
	
            System.out.println((i)+" : Area of this circle is "+Area);
        }
		
		
		
		
	}

}
