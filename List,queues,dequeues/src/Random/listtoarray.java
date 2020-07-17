//Java Program to convert list to array
package Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class listtoarray {
	public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        String[] array = new String[list.size()];
        list.toArray(array);

        System.out.println(Arrays.toString(array));

    }

}
