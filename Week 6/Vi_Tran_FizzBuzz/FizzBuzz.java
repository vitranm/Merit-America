public class FizzBuzz {

	public static String of(int i) {
		if(i == 0)= 
        return "0";

        return _off(i);
	}
	
	private static String _off(int i){
        String s= "";
        if(i % 3 == 0)
          s += "Fizz";
        if(i % 5 == 0)
            s += "Buzz";

        return !s.isEmpty() ? s : String.valueOf(i);     


    }
	
	

}