package practice;

public class highest {
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7,8,20,19,17,21,22,33,0,1};
		int a=0;
		int b=0;
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>a)
			{
				c=b;
				b=a;
				a=ar[i];	
			}
			else if(ar[i]>b)
			{
				c=b;
				b=ar[i];	
			}
			else if(ar[i]>c)
			{
				c=ar[i];
			}
		}
		System.out.println(c);
	}

}
