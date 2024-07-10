package com.siiet.thread;

public class Implementingrunnable  implements Runnable{
public static void main(String[] args) {
	Implementingrunnable r=new Implementingrunnable();
	//r.start(); 
	Thread t1=new Thread();
	t1.start();
}

@Override
public void run() {
System.out.println("implementing runnable interface");	
}
}
