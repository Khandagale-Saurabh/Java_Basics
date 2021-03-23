class program13a
{
int l;
int b;
program13a()
{
l=b=10;
System.out.println(""+l);

System.out.println(""+b);
} 
int  area (program12 r)
  {
 int result;
result=r.l*r.b;
System.out.println("  ere="+result);  
  } 
}

class program13
{
public static void main(String args[])
  {
      program12 aa=new program12();
           
      program12 a2=new program12();
           aa.area(a2);       
 }
}
