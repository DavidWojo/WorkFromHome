import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Starting main()...");
		//listExample1();
		//listExample2();
		testPerson();
		System.out.println("Ending main()....");
	}
	
	private static void testPerson()
	{
		Person person1 = new Person("David", "Wojciechowski");
		Person person2 = new Person("Sylvia","Kedzierski");
		List<Person> personList = new ArrayList<>();
		//personList.add(person1);
		personList.add(person2);
		System.out.println(personList.contains(person1));
	}
	
	private static void listExample2()
	{
		// Create a list of strings
		List<String> list1 = new ArrayList<>();
		list1.add("David");
		list1.add("Sylvia");
		list1.add("Alice");
		List<String> list2 = list1.subList(0, 1);
		System.out.println("Size of sub-list is " + list2.size());
		list2.set(0, "Davey");
		for (String s : list1)
		{
			System.out.println(s);
		}
	}
	
	private static void listExample1()
	{
		// Create a list of strings
		List<String> list1 = new ArrayList<>();
		list1.add("David");
		list1.add("Sylvia");
		list1.add("Alice");
		
		// iterate over list with for-each construct
		// Print the string value
		for (String s : list1)
		{
			System.out.println(s);
			// Note next line compiles fine, but throw exception 
			// when executing becasue you cannot modify list when
			// iterating with a for-eacch conbstruct
			
			//list1.remove(0);
		}
		
		// Create another list of strings
		// Iterate over list and remove an element if it is found
		// You can modify the list if you use an iterator while looping
		// through the list.  You cannot do this with a for each loop
		List<String>list2 = new ArrayList<>();
		list2.add("Kathy");
		list2.add("Karen");
		list2.add(0, "Dale");
		
		ListIterator<String> listIter = list2.listIterator();
		while (listIter.hasNext())
		{
			String s = listIter.next();
			if (s.equals("Kathy"))
			{
				listIter.remove();
			}
			System.out.println("String value is: " + s);
		}
		System.out.println("There are " + list2.size() + " names in the list.");
	}
	
	private static void doStringExample()
	{
		String s1 = new String( original: "ttt");
		
	}
}
