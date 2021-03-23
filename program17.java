class point
{
private int x,y;
  
    public point()
   {
    y=x=20;
   System.out.println(" "+x+" "+y);
   }
   public point(int x1,int y1)
   {
        x=x1;
        y=y1;
 System.out.println(" "+x+" "+y);
    
  } 
  public point(point p)
   { 
       x=p.x;
      y=p.y; 
System.out.println(" "+x+" "+y);
     
}
public point(point pp,int u)
 {
  u=50;
   x=pp.x;
   y=pp.y;
System.out.println(""+u);
 }
}

class program17
 {
 public static void main(String args[])
   {
     point obj=new point();
     point obj1=new point(4,55);
      point obj2=new point(obj1);
      point obj3=new point();          
       point obj4=new point(obj3,50);
  }
 }