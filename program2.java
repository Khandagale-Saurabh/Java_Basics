class program2
{
  int a,b,c;
double e;
program2()
{
e=Math.sqrt(9);
System.out.println("e="+e);
}

  public void set()
   {
    a=b=c=0;
   }     
  public void set(int a1,int b1,int c1)
   {
    a=a1;
     b=b1;
      c=c1;
   }

    public void show()
   {
      System.out.println("a="+a);
    System.out.println("b="+b);
       System.out.println("c="+c);
      
  }
   
  
}

class program2c
{
public static void main(String args[])
      {
       program2 obj=new program2();
       obj.set();

   obj.show();
   obj.set(11,22,33);     
   obj.show();
      for(String ss:args)
   {
      System.out.println("a="+args);
      
    }

      }
}
