package com.dnpass.corejavatraining.day10.Threads;

import java.util.concurrent.*;
import java.util.logging.Logger;

public class FactorialTaskDemo {

	public static void main(String[] args) throws Exception {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		FactorialTask task = new FactorialTask(5);
		System.out.println(task.call());
	}

}

class FactorialTask implements Callable<Integer>{
	int number;
	public FactorialTask(int number) {
		super();
		this.number=number;
	}
	@Override
	public Integer call() throws Exception {
		
		int fact = 0;
		for(int count=number;count>1;count--) {
			fact=fact*count;
		}
		return fact;
	}
}
class EventLoggingTask implements Runnable{
	static final Logger logger=Logger.getLogger(EventLoggingTask.class.getName());
	@Override
	public void run() {
		
		logger.info("Message");
		
	}
	
}