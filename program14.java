class program14
{
int x;
program14(int x)
{
this.x=x;
}
program14 upgrade()
{
program14 pp=new program14(x+10);
return pp;

}
public static void main(String args[])
 {
program14 p=new program14(20);
System.out.println("before"+p.x);
p=p.upgrade();
System.out.println("before"+p.x);

 }
}