class samplebase
{
  public samplebase()
   { 
   System.out.println("inside base class constructor");
   }
}
class sampleder extends samplebase
 {
     public sampleder()
  {
 System.out.println("inside derived1 class constructor");
  }
}

class program23
 {
   public static void  main(String args[])
   {
     sampleder obj=new sampleder();
   }
 }