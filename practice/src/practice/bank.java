package practice;

import java.util.Scanner;

public class bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your much amount u want to draw: ");
		int balance=sc.nextInt();
		try {
			if (balance<10000)
			{
				userdefind u=new userdefind("Insufficient balance");
				throw u;
			}
		}
		catch(userdefind u)
		{
			
			System.out.println(u);
		}
		
		
	}

}
