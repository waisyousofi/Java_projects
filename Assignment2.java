
class source
{
	private int good;
	boolean available=false;
	synchronized public void consume()
	{
		while(available==false)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("consumed :"+good);
		available=false;
		notify();
	}

	synchronized public void produce(int i)
	{
		while(available==true)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
			}
		}
		good=i;
		available=true;
		System.out.println("produced "+good);
		notify();
	}	
}

class Producer extends Thread
{
	private source src;
	public Producer(source obj)
	{
		src=obj;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			src.produce(i);
		}
	}		
}

class Consumer extends Thread
{
	private source src;
	public Consumer(source obj)
	{
		src=obj;	
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			src.consume();
		}
	}
}
	
class Assignment2
{
	public static void main(String ars[])
	{
		source s=new source();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		p.start();
		c.start();
	}
}