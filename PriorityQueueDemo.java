package com.dnpass.corejavatraining.day8.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("red");
		queue.add("green");
		queue.add("yellow");
		queue.add("white");
		System.out.println("Elements of the Priority Queue");
		System.out.println(queue);
		
		
		for(String element:queue)
		{
			System.out.println(element);
		}
		
		PriorityQueue<String> queue2=new PriorityQueue<String>();
		queue2.add("yellow");
		queue2.add("black");
		queue2.add("gren");
		
		System.out.println("Priority Queue2:"+queue2);
		
		queue.addAll(queue2);
		System.out.println("new priority Queue:"+queue);
		
		
		
		queue.offer("blue");
		System.out.println("the new priority queue"+queue);
		
		
		
		
		queue.clear();
		System.out.println("the new priority queue:"+queue);
		
		System.out.println("the size of the priority queue"+queue.size());
		
		System.out.println("the first element of the queue:"+queue.peek());
		System.out.println("priority queue after removing first element"+queue);
		
		System.out.println("the last element of the queue:"+queue.poll());
		System.out.println("after removing the priority queue:"+queue);
		
		
		

           List<String> array_list=new ArrayList<String>(queue);
           System.out.println("array containing all of the elements in the queue:"+array_list);
		
	
           
           PriorityQueue<Integer> pq1=new PriorityQueue<>(10,Collections.reverseOrder());
           pq1.add(10);
           pq1.add(22);
           pq1.add(17);
           System.out.println("\n Original Priority Queue:"+pq1);
           System.out.println("\nMaximum Priority Queue:");
           Integer val=null;
           while((val=pq1.poll())!=null) {
        	   System.out.println(val+" ");
        	   
           }
		System.out.println("\n");
	}

}