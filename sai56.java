abstract class sai56
{

  abstract public void fun();

}

class sai56child extends sai56
{
	public void fun()
	{
		System.out.println("Inside fun of main()");
		}

		public static void main(String sss[])
		{
			  sai56child s1=new sai56child();
			  s1.fun();
			}

	}