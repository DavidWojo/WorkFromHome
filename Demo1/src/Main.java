import java.util.ArrayList;
import java.util.Collection;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Starting main()...");
		testCollections();
		System.out.println("Ending main()....");
	}
	
	private static void testCollections()
	{
		Collection<String> col = new ArrayList<String>();
		col.add("David");
		col.add("Sylvia");
		for (String s : col)
		{
			System.out.println(s);
		}
	}
}
