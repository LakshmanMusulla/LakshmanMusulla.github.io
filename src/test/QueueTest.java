package test;

public class QueueTest {
	int front, rear, size;
	int array[];
	int capacity;

	public QueueTest(int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		front = this.size = 0;
		rear = capacity - 1;
	}

	boolean isFull(QueueTest queue) {
		return (queue.size == queue.capacity);
	}

	boolean isEmpty(QueueTest queue) {
		return (queue.size == 0);
	}

	void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size += 1;
		System.out.println(item + " -> Enqueue to Queue is success");

	}

	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		this.size = this.size - 1;
		return item;
	}

	int front() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

	int rear() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.rear];

	}

	public static void main(String[] args) {
		QueueTest queue=new QueueTest(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(40);
		queue.enqueue(50);
		
		System.out.println(queue.dequeue()+ " Dequeued Item from Queue");
		System.out.println(queue.dequeue()+ " Dequeued Item from Queue");
		System.out.println("Front Item is "+ queue.front());
		System.out.println("Rear Item is "+queue.rear());
	}

}
