class A
{
   void addnew(int i)
   {
     Thread t = Thread.currentThread();
     for(int n = 1; n<=5;n++)
     {
       System.out.println(t.getName()+"-"+(i+n));
     }
   }
}
class B extends Thread
{ 
   A a1 = new A();
   public void run()
   {
     a1.addnew(100);
   }
}
class syntex
{
  public static void main(String[]args)
  {
    B b1 = new B();
    Thread t1=new Thread(b1);
    Thread t2=new Thread(b1);
    t1.setName("Abhay");
    t2.setName("Dubey");
    t1.start();
    t2.start();
  }
} 