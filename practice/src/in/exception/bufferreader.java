package in.exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class bufferreader implements Serializable{
	int age;
	String name;
	public bufferreader(int age,String name) {
		this.name=name;
		this.age=age;
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		return "bufferreader [age=" + age + ", name=" + name + "]";
	}
	public static void main(String[] args)  {
		bufferreader b=new bufferreader(1,"raj");
		try {
		FileReader f=new FileReader("d://data.txt");
		BufferedReader b1=new BufferedReader(f);
		String s=b1.readLine();
		
		while(s != null)
		{
			System.out.println(s);
			s=b1.readLine();
		}
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
