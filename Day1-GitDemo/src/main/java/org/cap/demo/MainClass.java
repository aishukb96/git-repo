package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
	 System.out.println("Hello World");
	 greet();
	 SalesClass salesClass1=new SalesClass();
	 salesClass1.show();
	 SalesComplete disp=new SalesComplete();
	 disp.display();
	 salesClass1.printLoop();
	 for(int i=0;i<2;i++)
		 System.out.println(i);
		  System.out.println("Process completed");
	}

	public static void greet()
	{
		System.out.println("New changes");
		System.out.println("Welcome to this page");
		System.out.println("Hello");
	}
	
}
