public class FizzBuzzTest{
  @Test
  public void of_0is0(){
    asserThat(FizzBuzz.of(0), is ("0"));

  }
  @Test
  public void of_1is1(){
    asserThat(FizzBuzz.of(1), is ("1"));

  }
  @Test
  public void of_3isFizz(){
    asserThat(FizzBuzz.of(3), is ("Fizz"));

  }
  @Test
  public void of_5isBuzz(){
    asserThat(FizzBuzz.of(5), is ("Buzz"));

  }
  @Test
  public void of_6isFizz(){
    asserThat(FizzBuzz.of(6), is ("Fizz"));

  }
  @Test
  public void of_10isBuzz(){
    asserThat(FizzBuzz.of(10), is ("Buzz"));

  }
  @Test
  public void of_15isFizzBuzz(){
    asserThat(FizzBuzz.of(15), is ("FizzBuzz"));

  }





}