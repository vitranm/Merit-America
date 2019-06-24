public class ListOfExceptions {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");

		for(int i = 0; i < myList.size(); i++) {
		    try {
			    Integer castedValue = (Integer) myList.get(0);
		    }
		    catch (ClassCastException e) {
			    System.out.println("Element " + i + " of value " + myList.get(i) + " can't be casted to Integer");
	        }

        }   
}


