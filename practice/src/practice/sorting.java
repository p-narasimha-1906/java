package practice;

import java.util.Arrays;

public class sorting {
	public static void main(String[] args) {
		int a[]= {3,2,4,1,5,7,90,78,67};
//		int m=a[1];
//		a[1]=a[0];
//		a[0]=m;
//		
		
		for(int i=0;i<a.length;i++)
		{
			for(int k=i+1;k<a.length;k++)
			{
			if(a[i]>a[k])
			{
				int tenp=a[k];
				a[k]=a[i];
				a[i]=tenp;
			}
		}
		}
		System.out.println(Arrays.toString(a));
	}

}
