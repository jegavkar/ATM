package threadd;

public class intercommu
{
 int amount=10000;
 synchronized void with_draw(int amount)throws InterruptedException
 {
	 if(this.amount<amount)
	 {
		 System.out.println("insufficient balance");
		 wait();
		 System.out.println("amount creadited");
		 this.amount-=amount;
		 System.out.println("with draw successful\nBalance is "+this.amount);
	 }
	 else
	 {
		 this.amount-=amount;
		 System.out.println("with draw successful\nBalance is "+this.amount);
	 }
	}
  synchronized void deposit (int amount)
  {
	  this.amount+=amount;
	  System.out.println("deposite successfully \nbalance is "+this.amount);
	  notify();
  }
}
