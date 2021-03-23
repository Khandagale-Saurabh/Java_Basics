class program32
{
  int a;
  public void get()
  {
    a=20;
  System.out.println(a);
  }
    void dis()
   {
    System.out.println("inside class a");
   }
}
class pro32 extends program32
{
   void dis()
   {
      super.dis();
     pro32 o=new pro32();
    
  System.out.println("inside class b");
   }
}
class exe32
{
 public static void main(String[] a)
 {
         program32 obj=new       program32();
         obj.dis();
          pro32  p=new pro32();
          p.dis();  
 }
}