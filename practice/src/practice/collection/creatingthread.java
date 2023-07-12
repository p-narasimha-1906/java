package practice.collection;


public class creatingthread implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}

	
	public static void main(String[] args) {
		/*Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for (int i=0;i<=5;i++)
				{
					System.out.println(i);
				}
			}
		};
		Thread t=new Thread(r);
		t.start();*/
		
//		creatingthread c=new creatingthread();
//		Thread t=new Thread(c);
//		t.start();
//		
		
		
		
		
		Runnable r=()->{for (int i=0;i<=5;i++)
		{
			System.out.println(i);
			
			
		}};
		Thread t=new Thread(r);
		t.start();
		
		
		}
		
	

	

}
