class program37
{
   protected int age;
  protected String name;
  protected double salary;
   
public  void  read(String n,int a,double s)
   {
     name=n;
     age=a;
     salary=s; 
   }
            public String toString()
     {
       String str;
       str="{ name="+name +" age:"+age+"  salary"+salary+"}";
         return str;
     }     
   
}

class der11 extends program37
 {
           public String toString()
     {

       String str1;

         name="INSIDE CLASS 2";
         age=20;
          salary=100.0;
       str1="{ name="+name +" age:"+age+"  salary"+salary+"}";
         return str1;
     }     
    
 }
class pro37
{
   public static void main(String a[])
    {
     program37 pp=new program37();
pp.read("Saurabh",20,30.44);
System.out.println(pp);
  der11 dd=new der11();
       System.out.println(dd);
    } 
}