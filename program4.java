class wr
{
    public static void  main(String args[])
    {
  
    for(String s:args)
          {
      String  e= Integer.toString(s);
              System.out.println(" "+e);

          }
    
 String ss[]=new String[4];
ss[0]="10";
ss[1]="11";
ss[2]="19";
ss[3]="30";
       for(String o:ss)
      {
     int dd=Integer.parseInt(o);
     System.out.println(""+dd);
         }
    }
}