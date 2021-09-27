package sec02.exam04_casting;

public class CheckValueBeforeCasting {
  public static void main(String[] args){
    
   int i =128;

    if(i<-128 || i>127) 
    //위 내용을 (i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) 라고 표현할 수도 이싿.
    {
      System.out.println("byte타입으로 변환할 수 없습니다.")
      System.out.println("값을 다시 확인해주세요")
    } else {
      byte b = (byte) i;
      System.out.println(b);
    }

   byte b = (byte) i;
   System.out.println(b);

  }
}

