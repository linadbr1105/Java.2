package sec02.exam04_casting;

public class LongExample {
  public static void main(String[] args){
    
    int intValue = 44032;
    char charValue = (char) intValue;
    System.out.println(charValue);
    //가
    long longValue = 500;
    intValue = (int) longValue;
    System.out.println(intValue);
    //500

    double doubleValue = 3.14;
    intValue = (int) doubleValue;
    System.out.println(intValue);
    //3

  }
}