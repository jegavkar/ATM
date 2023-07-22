package threadd;

public class intercommu2
{
 public static void main(String[] args)
 {
	 intercommu obj2=new intercommu();
	new Thread()
	{
		public void run()
		{
			try
			{
				obj2.with_draw(15000);
			}
			catch(Exception e)
			   {
				   e.printStackTrace();
			   }
		}
	}
	.start();
	new Thread()
	{
		public void run()
		{
			obj2.deposit(10000);
		}
	}
	.start();
 }
}
