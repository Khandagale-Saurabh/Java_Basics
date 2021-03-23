import java.util.Arrays;
class program15
{
  public static void main(String args[])
    {
      int[] a={130,220,30,450,50};
      for(int i=0;i<=a.length-1;i++)
       {
         System.out.println(" array  at pos "+i +(" "+a[i]));
       } 
    
                  int b[]=new int[10] ;
           for(int i=0;i<=a.length-1;i++)
           {
                 b[i]=a[i];
                 System.out.println("copy are"+b[i]);
            } 
            
           Arrays.sort(a);
      for(int i=0;i<=a.length-1;i++)
           System.out.println("sort "+a[i]); 
    
    }
}