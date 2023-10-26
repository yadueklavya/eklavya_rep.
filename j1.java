

class Threadpriorities
{
   public static void main(String[] args)
   {
   A aa=new A();
   B bb= new B();
   C cc=new C();
   try
   {
   for(int i=1;i<=5;i++)
   cc.setPriority(Thread.MAX_PRIORITY);
   bb.setPriority(aa.getPriority()+1);
   aa.setPriority(Thread.MIN_PRIORITY);
  System.out.println("Thread A Started");
aa.start();
  System.out.println("Thread B Started");
bb.start();
  System.out.println("Thread C Started");
cc.start();
  System.out.println("MAIN THREAD ENDED");
Thread.sleep(1000);
   }
catch(Exception e)
{
	
}
   }
}

class A extends Thread
{
    public void run()
    {
		try{
   // System.out.println("Thread A Started");
    
    for(int i=0;i<=5;i++)
    {
        System.out.println("From Thread A: i="+i);
		Thread.sleep(1000);
    }
    System.out.println("Thread A Ends Here");
		}
		catch(Exception e)
		{
			
		}
    }
}
class B extends Thread 
{
    public void run()
        {
			try{
           // System.out.println("Thread B Started");
            for(int j=0;j<=5;j++)
            {
                System.out.println("From Thread B:j="+j);
				Thread.sleep(1000);
            }
            System.out.println("Thread B Ends Here");
			
			}   
			catch(Exception e)
			{
				
			}
			}
}
class C extends Thread 
{
    public void run()
    {
		try{
       // System.out.println("Thread C started");
        for(int k=0;k<=5;k++)
        {
            System.out.println("From Thread C : k="+k);
			Thread.sleep(1000);
        }
        System.out.println("Thread C Ends Here ");
    }
	catch(Exception e)
	{
		
	}
	}
}