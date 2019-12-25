package test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuetest {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("lakshman");
		pq.add("Nemo");
		pq.add("Arun");
		pq.add("Rami");
		pq.offer("used offer");
		System.out.println(pq.contains("Nemo"));
		System.out.println(pq);
		pq.remove("Rami");
		pq.poll();
		System.out.println(pq.size());
		System.out.println(pq.peek());
		
		pq.clear();
		Iterator itr = pq.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
