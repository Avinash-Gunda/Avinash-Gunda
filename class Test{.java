class Test{

  
  static void Demo(int n)throws DemoExpection{
   if(n%2==0){
    System.out.println(n);
   }
   if(n%2!=0){
    throw new DemoExpection();
    System.out.println("The number is odd");
   }
   
  }
  public static void main(String args[]){
    Test obj=new Test();
    int a=3;
    try{
   Demo(a);
    }
    catch(DemoExpection e){
      System.out.println(e);
    }
  }
}
class DemoExpection extends Expection {
  public String toString(){
    System.out.println("Tne number is odd");
  }
}