package practice;

import java.util.Arrays;

public class strings {
	public static void main(String[] args) {
	 int[] a= {1,4,2,9,7,3,0,56};
	 int l=0;
	 int k=1;
	 int r=a.length-1;
	while(l<=r)
	{ 
		int m = l + (r - l) / 2;
		//System.out.println(m);
		if(a[m]==k)
		{
			System.out.println(m);
			break;
		}
		else if(k<a[m])
		{
			r=m-1;
		}
		else if(k>a[m])
		{
			l=m+1;
		}
		
		
	}
	  
	}
	}

	


