package practice.collection;

public class methdref {
	void m1()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		methdref m=new methdref();
		Runnable r= m :: m1;
		Thread t =new  Thread(r);
		t.start();
	}

}
