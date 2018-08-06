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
	}

	public static void greet()
	{
		System.out.println("New changes");
		System.out.println("Welcome to this page");
		System.out.println("Hello");
	}
}
