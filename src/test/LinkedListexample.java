package test;

public class LinkedListexample {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public void insertNode(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("This is not a vali Node. ");
			return;

		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void append(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		
		Node last =head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=new_node;
		return;

	}
	
	public void printNthfromLast(int n)
	{
		int len=0;
		Node temp=head;
		
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		if(len<n)
		{
			return;
		
		}
		temp=head;
		for(int i=1;i<len-n+1;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
		
	}
	
	 void printMiddle() 
	    { 
	        Node slow_ptr = head; 
	        Node fast_ptr = head; 
	        if (head != null) 
	        { 
	            while (fast_ptr != null && fast_ptr.next != null) 
	            { 
	                fast_ptr = fast_ptr.next.next; 
	                slow_ptr = slow_ptr.next; 
	            } 
	            System.out.println("The middle element is [" + 
	                                slow_ptr.data + "] \n"); 
	        } 
	    } 
	
	public void push(int new_data)
	{
		Node newnode=new Node(new_data);
		newnode.next=head;
		head=newnode;
	}

	public static void main(String[] args) {
		LinkedListexample ll = new LinkedListexample();
		ll.head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		ll.head.next = n1;
		n1.next = n2;
        ll.push(10);
		ll.push(23);
		ll.append(20);
		ll.append(27);
		ll.insertNode(ll.head.next, 8160);
		ll.printList();
		ll.printMiddle();

	}

}
