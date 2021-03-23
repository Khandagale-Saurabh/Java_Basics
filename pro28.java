class base26
{
  protected int a,b,c;
 public  base26()
  {
    a=b=c=330;  
    System.out.println("insede default of base  a:"+a+"b:"+b+"c"+c);
  }
   public base26(int a1,int b1,int c1)
   {
        a=a1;
        b=b1;
        c=c1;
    System.out.println("inside arg of base  a:"+a+"b:"+b+"c"+c);
     
   }
}
class der26 extends base26
{
  protected int d;
     public der26()
      {
      super();
      d=10;
     System.out.println("  D:"+d);
      }
     public der26(int a1,int b1,int c2,int d1)
     {
        super(a1,b1,c2);
         d=d1;
       System.out.println("d -----inside der 2"+d);
     }   
}

class pro28
{
public static void main(String a[])
 {
    der26 p=new der26();
    der26 p2=new der26(1,2,3,4);  
 }
}
