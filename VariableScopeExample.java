package sec01.exam01_varuable;

public class VariableScopeExample {
  public static void main(String[] args){
    int var1;

    if(true){
      int var2;

      var1=10;
      var2=20;
    }
    var1=10;
    
    for(int i=0; i<1; i++){
      int var3;
    }


  }
}