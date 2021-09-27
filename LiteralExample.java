package sec01.exam01_varuable;

public class LiteralExample{
  public static void main(String[] args){
    int var1 = 10;
    System.out.println(var1);
      //10
    int var2 = 010;
    System.out.println(var2);
      //8
    int var3 = 0x10;
    System.out.println(var3);
      //16

    double var4 = 0.25;
    System.out.println(var4);
    //0.25

    double var5 = 2E5;
    System.out.println(var5);
    //200000.0

    char var6 = 'A';
    System.out.println(var6);

    char var7 = 'B';
    System.out.println(var7);

    System.out.println('\t'+"Tap");

    System.out.println("South"+'\n'+"Korea");

    System.out.println("That"+ '\'' + "s Java");

    System.out.println("This is " + '\"'+"important"+'\"'+"thing");

    System.out.println("The price is "+'\\'+ "300 dollars");

    char var8 = '\u0041';
    //41 is unicode of 65 (65 is unicode of A)
    System.out.println(var8);

    System.out.println("java"+8);

    String var9 = "Java";

    boolean var10 = true;
    boolean var11 = false;
    System.out.println(var10);

  }
}