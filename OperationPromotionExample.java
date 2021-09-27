package sec02.exam04_operation;

public class OperationPromotionExample {
  public static void main(String[] args){
    
    byte byteValue1 = 10;
    byte byteValue2 = 20;
    //byte byteValue3 = byteValue1 + byteValue2
    //정수 연산이므로 가장 기본인 int타입으로 저장되어 있는 1,2를 1byte인 3에 저장하려면 오류가 남.
    int intValue1 = byteValue1 + byteValue2;
    System.out.println(intValue1);
    //30도출.


    char charValue1 = 'A';
    char charValue2= 1;
    //char charValue3 = charValue1 + charValue2
    //int타입 이하의 정수타입을 저장하면 자동으로 int타입으로 저장된다. 그래서 아래와 같이 저장해야함. 
    int intValue2 = charValue1 + charValue2;
    System.out.println(intValue2);
    //유니코드인 65에 +1이 되어 66이 도출.
    System.out.println((char)intValue2);
    //A에 1을 더한 유니코드로 B가 도출.

    int intValue3 = 10;
    int intValue4 = intValue3/4;
    // 10/4는 2.5지만 정수값인 2가 저장된다.
    System.out.println(intValue4);
    //2출력

    int intValue5 = 10;
    //int intValue = 10/4.0;
    //피 연산자 중 실수가 있으면 다른 정수도 자연히 실수인 double타입으로 저장된다. 그래서 int에 저장하면 안된다.
    double doubleValue = intValue5 / 4.0;
    System.out.println(doubleValue);


  }
}