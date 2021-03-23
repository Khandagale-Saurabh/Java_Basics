class program12
{
int l;
int b;

program12()
{
l=b=10;
System.out.println(""+l);

System.out.println(""+b);
} 
int area (program12 r)
  {
 int result;
result=r.l*r.b;
System.out,println("  ere="+r);  
  } 
}

class program12a
{
public static void main(String args[])
  {
      program12 aa=new program12();
           
      program12 a2=new program12(aa);
                  
 }
}
