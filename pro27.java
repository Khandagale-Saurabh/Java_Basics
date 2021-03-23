abstract class program27
{
protected  int a,b;
public  program27(int a1,int b1)
   {
     a=a1;
     b=b1;
    }
public abstract void display();

}
class der27 extends program27
{
protected  int c;
public  der27(int a1,int b1,int c1)
  {
   super(a1,b1);
   c=c1;
  }
 public void display()
  {
   System.out.println("a= "+a+" b "+b+"c "+c);
  }  
}
class pro27
{
public static void main(String a[])
 {
   der27 d=new der27(1,2,3);
   d.display();
 }
}