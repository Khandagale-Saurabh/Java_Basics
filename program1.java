class program1
{
    
          int a;
   
        int b;      
     public void set(int a1,int b1)
           {
          a=a1;
          b=b1;    
           }
         
             public void show()
                  {
                 System.out.println("a="+a);
                 System.out.println("b="+b);  
               } 
    
}



class program1c
{
    public static void main(String args[])
   {
         program1 s1=new  program1();
           s1.set(12,11);
          s1.show();
   }
}