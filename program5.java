class program5
{
   public static void main(String args[])
  {
 int sum=0;
int sub=0;
int mul=1;
double div=1.0;
       for(String s:args)

       {
 sum=sum+Integer.parseInt(s);      
 
sub=Integer.parseInt(s)-sub;
mul=mul*Integer.parseInt(s);
 div=Integer.parseInt(s)/div;
  }
System.out.println("Sum="+(sum)); 
System.out.println("Sub="+(sub));   
System.out.println("MUL="+(mul));   
System.out.println("div="+(div));   

}
}