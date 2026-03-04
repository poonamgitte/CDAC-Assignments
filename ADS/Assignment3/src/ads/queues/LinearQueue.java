package ads.queues;

public class LinearQueue implements Queue {
	
	int[] queueData;
	int front;
	int rear;
	
	public LinearQueue(int n) {
		queueData = new int[n];
		this.front = -1;
		this.rear = -1;
	}
	

	@Override
	public void enqueue(int element) {
		if(isFull()) {
			//System.out.println("Queue is full");
			return;
		}
		rear++;
		queueData[rear] = element;
	}

	
	@Override
	public int dequeue() {
		
		if(isEmpty()) {
			//System.out.println("Queue is empty");
			return -1;
		}
		
		front++;
		
		return queueData[front];
	}

	@Override
	public boolean isFull() {
		
		if(rear == queueData.length-1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		
		if(front == rear)
			return true;
		
		return false;
	}
	
	void display() {
		for(int i=front+1; i<=rear;i++) {
			System.out.print(queueData[i]+" ");
		}
		System.out.println();
	}

}
