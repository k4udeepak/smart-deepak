package com.deepak;

public class JavaThread extends Thread{
	public void run() {
		System.out.println("Thread");
		System.out.println("Running");
	}
public static void main(String[] args) {
	JavaThread th1=new JavaThread();
	th1.start();
}
}
