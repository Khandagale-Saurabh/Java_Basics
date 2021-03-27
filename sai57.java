interface s57
{
final int  q=222;

public void rect();
public void triangle();
public static void  nn();
}
class sai57 implements s57
{ protected int a1=10,b1=30;
int q=10;
	protected float c1;
	public static void  nn()
	{
		System.out.println("sss");
		}
	  public void rect()
      {
          c1=a1*b1;
          System.out.println(c1);
          System.out.println(q);

      }
   public void triangle()
       {
           c1=(float)0.5*a1*b1;
            System.out.println(c1);
       }
   public static void main(String args[])
   {
        sai57 obj=new sai57();
        obj.rect();
        obj.triangle();
        sai57.nn();
   }
}