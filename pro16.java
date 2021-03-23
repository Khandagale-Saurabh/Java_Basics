class program16
{
     int a,b;
     program16(int a1,int b1)
          {
                a=a1;
              b=b1;
            System.out.println("a"+a+" b"+b);
          }
       program16()
         {

this(20,3);            
            int c;
         c=30;
      System.out.println(c);
          }
program16(int aaa)
 {
this(5,6);
      aaa=3030;
System.out.println(aaa);
 }
     
}  

class pro16
{
public static void main(String args[])
   {
     program16 obj=new program16(12,33);
	 program16 o=new program16();      
             program16 p=new program16(2);
   }
}