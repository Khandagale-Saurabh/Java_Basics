class rectangle
{
int length;
int breath;
rectangle(int l,int b)
 {
length=l;
breath=b;

 }
int area(rectangle r)
  {
    int result;
result=r.length*r.breath;
System.out.print(" "+result);
return result;
  }


public static void main(String args[])
 {
      rectangle aaa=new rectangle(30,10);
          aaa.area(aaa);      
 }
}


