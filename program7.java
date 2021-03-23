class program7
{
 public static void main(String args[])
 {
 int i;
loop:
         for(int i=0;i<=10;i++)
         if(i==3) continue;   

         if(i==5) break loop;
System.out.println(i);   

 }
}