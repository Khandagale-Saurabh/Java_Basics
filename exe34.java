class program34
{
   int a=111;
   int b=222;
   void fn1()
   {
       System.out.println("inside class first");
   }
}
class pro34 extends program34
{
    int c=333;
    int d=444;
    void fn2()
   {
       System.out.println("inside class second");
   }
}

class exe34
{
    pro34 obj=new pro34();
   
    System.out.println(obj.a);
}