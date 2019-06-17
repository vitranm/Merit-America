public class StringManipulationTest {
    public static void main(String[] args){
        StringManipulation manipulator = new StringManipulation();
        String str = manipulation.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); 

        char letter = 'o';
        Integer a = manipulation.getIndexOrNull("Coding", letter);
        Integer b = manipulation.getIndexOrNull("Hello World", letter);
        Integer c = manipulation.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c); 

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = manipulation.getIndexOrNull(word, subString);
        Integer e = manipulation.getIndexOrNull(word, notSubString);
        System.out.println(d); 
        System.out.println(e); 

        String word2 = manipulation.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2); 
    }
}

