package ads.circularqueue;

public class CircularQueue implements CircularQueueInterface{
	
	int[] queueData ;
	int front;
	int rear;
	int size ;
	
	public CircularQueue(int size) {
		queueData = new int[size];
		front = -1;
		rear = -1;
		this.size = size;
	}

	@Override
	public void enqueue(int data) {
		// TODO Auto-generated method stub
		
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
				
		if(isEmpty()) {
			front =0;
			rear = 0;
			queueData[rear] = data;
		}
		else {
			
			rear = (rear+1)%size;
			
			queueData[rear] = data;
		}
		
	}

	@Override
	public int dequeue() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		
		int tempData = queueData[front];
		
		if(front == rear) {
			front =-1;
			rear = -1;
			
		}
		else {
			front = (front+1)%size;
		}
		
		return tempData;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		
		if(front == (rear+1)%size) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		
		if(front == -1) {
			return true;
		}
		return false;
	}
	
	// Display
	
	void display() {
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		
		int i = front;
		while(true) {
			System.out.print(queueData[i]+" ");

			if(i == rear) {
				break;
			}
			i = (i+1)%size;
		}
		System.out.println();
		
		
	}
	
}
