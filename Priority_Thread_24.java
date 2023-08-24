
class Priority_Thread_24 extends Thread
{
    public void run()
    {
     System.out.println("run method");       
     }
   public static void main(String []args)
   {
	 Priority_Thread_24 p1= new Priority_Thread_24();
	 Priority_Thread_24 p2= new Priority_Thread_24();
     p1.setPriority(4);
     p2.setPriority(7);
     System.out.println("priority of thread 1 is : "+p1.getPriority());       
     System.out.println("priority of thread 2 is : "+p2.getPriority());       
      p1.start();
      p2.start();
   }
}
