class samplebase
{
  public samplebase()
   { 
   System.out.println("inside base class constructor");
   }
}
class samplebase2
 {
     public samplebase2() 
    {
    System.out.println("inside base2 construct");
    }

 }
class sampleder extends samplebase
 {
     public sampleder()
  {
 System.out.println("inside derived1 class constructor");
  }
}

class sampleder2 extends sampleder
{
  public sampleder2()
  {
 System.out.println("inside derived2 class constructor");
    
  }
}

class program22
 {
   public static void  main(String args[])
   {
     sampleder2 obj=new sampleder2();
   }
 }