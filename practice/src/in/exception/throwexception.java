package in.exception;


class userdefind extends RuntimeException
{
	public userdefind(String s) {
		super(s);
	}
}

public class throwexception {
	public static void main(String[] args) {
		int a=9;
		int b=0;
		try {
			a=10;
			System.exit(a);
			System.out.println("hello");
		}
		
		catch(Exception ar)
		{
			System.out.println("catch");
			ar.printStackTrace();
		}
		System.out.println("out");
	}

}
