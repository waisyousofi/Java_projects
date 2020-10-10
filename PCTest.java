public class PCTest
{
	public static void main(String[] args)
	{
		source s=new source();
	      	Producer p1 = new Producer(s);
	       	Consumer c1 = new Consumer(s);
	       	p1.start(); 
	      	c1.start();                                                                                                   
   	}
}

class source 
{
	private int contents;
	private boolean available = false;
   
   	public synchronized void consume()
	{
		while (available == false)
		{
			try
			{
        		    System.out.println("costumer requested and waiting"+"\n");
		            wait();
			    System.out.println("costumer requested is confirmed and good is produced"+"\n");
         		}
		 	catch(InterruptedException e)
			{
				
			}
      		}
		System.out.println("consumed :"+contents+"\n");
		available = false;
		notify();
   	}

	public synchronized void produce(int value)
	{
		while(available == true)
		{
			try
			{
				System.out.println("producer waiting ....."+"\n");
				wait();
		        }
			catch(InterruptedException e)
			{
			} 
		}
		
		contents = value;
		available = true;
		notify();
		System.out.println("Produced :" + contents+"\n");
		
	   }
}

class Consumer extends Thread
{
	private source s2;
	public Consumer(source obj)
	{
		s2=obj;
	}
	
	
	public void run()
	{
	 	for (int i = 0; i < 10; i++) 
		{
	         	s2.consume();
      		}
	}
}

class Producer extends Thread
{
	private source s1;
	public Producer(source obj)
	{
		s1=obj;
	}
	public void run()
	{
      		for (int i = 0; i < 10; i++)
		{
			s1.produce(i);
		}
	}
}