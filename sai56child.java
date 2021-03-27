abstract class sai56
{

	 sai56()
	 {
		 System.out.println("sai56 parent constructor()");
		 }

   public void fun1(){
	     System.out.println("dd");
	   }

}

class sai56child extends sai56
{

	public void fun()
	{

		//super();
		System.out.println("Inside fun of main()");
		}

		public static void main(String sss[])
		{
			  sai56child s1=new sai56child();
			  s1.fun();
			  s1.fun1();

			}

	}