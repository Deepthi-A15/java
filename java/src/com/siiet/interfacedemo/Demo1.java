package com.siiet.interfacedemo;

public class Demo1 implements Childinterface {
	public void print()
	{
		System.out.println("print");
	}
	public void show()
	{
		System.out.println("show");
	}
public static void main(String[] args) {
	Demo1 d=new Demo1();
	d.show();
	d.print();
	
}
}
