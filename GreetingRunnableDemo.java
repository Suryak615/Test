package com.dnpass.corejavatraining.day10.Threads;

import java.util.Date;



class GreetingRunnable implements Runnable, ThreadDelay{

	private String greeting;
	private static final int REPETITION =10;
	
	public GreetingRunnable(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void run() {
		
		try {
			for(int i=1;i<=REPETITION;i++) {
				Date now = new Date();
				System.out.println(now+ " "+ greeting);
				Thread.sleep(ThreadDelay.DELAY);
			}
		}
		catch(InterruptedException e){
			
		}
	}
	
}
public class GreetingRunnableDemo { 
public static void main(String[] args) {
	
	GreetingRunnable r1= new GreetingRunnable("Hello world");
	GreetingRunnable r2= new GreetingRunnable("Good Bye.");
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
}

}

