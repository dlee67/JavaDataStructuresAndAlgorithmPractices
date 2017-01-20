import java.util.List;

class TestingList{

	public static void main(String args[]){

		String name1 = "Bob";

		String name2 = "Sam";

		String name3 = "Joe";

      //So, why?
		List<String> list = new List<String>();

		list.add("Bob");

		list.add(name1);

		list.add(name2);

		list.add(name3);

	}	

}