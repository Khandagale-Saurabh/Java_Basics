interface vehical
{
   public abstract void window();
   public abstract void ac();
}
class Bus implements vehical
{
   public void ac()
   {
	   System.out.println("AC -require");
	   }
     public void  window()
     {
		 System.out.println("Window -require");

		 }
}
abstract class car
{
	   public void window()
	   {
		   System.out.println("window  :- not requires");

		   }
		   public abstract  void ac();

	}

	class nano extends car
	{
		  public void ac()
		  {
			  System.out.println("NANO : AC require");

			  }

		}
class Test
{
	public static void main(String aaa[])
      {
		  Bus b=new Bus();
		     b.ac();
		     b.window();
		     nano c=new nano();
		     c.ac();
		     c.window();
		  }
	}
