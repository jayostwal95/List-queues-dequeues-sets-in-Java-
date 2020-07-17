//Java Program to not create more than three objects of a class
package Random;

public class ThreeInstance {
	static int i = 0;
	private ThreeInstance()
	{
		i++;
		System.out.println("With in private Constructor" +i);
	}

	static private ThreeInstance instance  = null;
	static ThreeInstance createObject()
	{
		if((null== instance)||(i<3))
		{
			System.out.println("With in if condition" +i);
			instance = new ThreeInstance();
		}
		
		return instance;
	}
	public static void main(String[] args) {

		ThreeInstance d=ThreeInstance.createObject();

		System.out.println("after creating first instance--"+d.hashCode());

		ThreeInstance d1=ThreeInstance.createObject();

		System.out.println("after creating second instance--"+d1.hashCode());

		ThreeInstance d2=ThreeInstance.createObject();

		System.out.println("after creating Third instance--"+d2.hashCode());

		ThreeInstance d3=ThreeInstance.createObject();

		System.out.println("after creating fourth instance--"+d3.hashCode());

		ThreeInstance d4=ThreeInstance.createObject();

		System.out.println("after creating fifth instance--"+d4.hashCode());

		ThreeInstance d5=ThreeInstance.createObject();

		System.out.println("after creating sixth instance--"+d5.hashCode());

		ThreeInstance d6=ThreeInstance.createObject();

		System.out.println("after creating sixth instance--"+d6.hashCode());

		}
}
