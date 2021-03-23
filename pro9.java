class pro9
{
String name;
int roll;
pro9()
 {
   System.out.println("Informaytion");
 }
   pro9(String n)
   {
  this();
     name=n;
   }
pro9(int r)
{
  this("saurabh");
   roll=r;
}
}


class pro9a
{
 public static void main(String args[])
  {
         pro9  a=new pro9(1);
          System.out.println("name="+a.roll);
     
          System.out.println("name="+a.name);
  }

} 