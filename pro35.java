class program35 extends Object
{
 protected  double real,img;
   void read(double r,double i)
    {
           real=r;
           img=i;
    }
   void display()
    {
      System.out.println("[ Real="+real+"  imag="+img+"]");
    }
  public  String toString()
    { 
      String str="[Real  "+real+"  Image"+img+" ]";
   return (str);
    }
}

class der  extends program35
{
  public String toString()
   {
     real=10;
       System.out.println("real="+real);
   }
}

class pro35
{
   public static void main(String a[])
   { 
     program35 p=new program35();
      p.read(10,20);
      p.display();
        System.out.println(p);
       der d=new der();
        System.out.println(d);
   }
}