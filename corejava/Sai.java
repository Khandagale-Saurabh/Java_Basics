import java.util.*;
/*class Sai{
static String name="Saurabh";
static Scanner sc;
static int roll;
static {
       sc=new Scanner(System.in);
       name=sc.nextLine();
       }
static {
         roll=sc.nextInt();
       }
    int ff=20;
  public static void main(String aa[])
  {
   Sai s=new Sai();
     System.out.println(name);
 System.out.println(s.ff);

     System.out.println(roll);
  }



}

*/


/*
class Sai
{
 //copy constructor will use when you want update data, compulsory to write one Sai(){} constutor to work and call time object pass
   int a=10;
   int b=20;
   Sai()
   {}
  Sai(Sai ref)
  {
     this.a=ref.a;
     this.b=ref.b;
   }
    public static void main(String aa[])
  {
      Sai obj1=new Sai();
      System.out.println(obj1.a);
      System.out.println(obj1.b);
      obj1.a=100;//upadte a, b but not reflect on oraginnal value so we crete copy
      obj1.b=200;
            System.out.println(obj1.a);
      System.out.println(obj1.b);
      Sai obj2=new Sai(obj1);

      System.out.println(obj2.a +"  "+obj2.b+"  ");

  }
 }
*/


class Outter
{
    class Inner
    {
	   public void m1()
	   {
		 System.out.println("indie m1");
		}
	 }
    public static void main(String aa[])
     {
	   outter o=new outter();
	   outter.inner i=new Inner();
	   i.m1();
     }

}
