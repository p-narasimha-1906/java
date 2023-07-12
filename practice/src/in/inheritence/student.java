package in.inheritence;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class student {
	int am=10;
	public synchronized void m1(int m)
	{
		if(am<m)
		{
			System.out.println("amount is less, please wait until amount added");
			try {
			wait();
			
		}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		if(am>m) {
			System.out.println("total amount: "+am);
			am=am-m;
			
			System.out.println("amount withdraw succussfully");
			System.out.println("remaining : "+am);
		}
		else
		{
			System.out.println("even deposit also amount is less");
		}
		
	}
	
	public synchronized void m2(int m)
	{
		am=am+m;
		System.out.println("amount diposit succussfully");
		
			notify();
		
		
	}

	public static void main(String[] args) {
		student s= new student();
		Thread t=new Thread() {
			public void run()
			{
				s.m1(11);
			}
		};
	
		Thread t1= new Thread() {
			public void run()
			{
				s.m2(0);
			}
		};
		t.start();
		try {
			Thread.sleep(100);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		t1.start();
	

}
}
