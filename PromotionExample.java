package sec03.exam01_promotion;

public class PromotionExample {
  public static void main(String[] args){
    
   byte byteValue = 10;
   int intValue = byteValue;
   System.out.println(intValue);
   //10 출력

   chat charValue = '가';
   intValue = charValue;
   System.out.println(intValue);
   // 44032 출력. 가에 대한 유니코트

   intValue = 500;
   long longValue = intValue;
   System.out.println(longValue);
   //500출력

   intValue = 200;
   double doubleValue = intValue;
   System.out.println(doubleValue);
   //200.0 출력

   longValue = 10000000000L;
   float floatValue = longValue;
   System.out.println(floatValue);

  }
}