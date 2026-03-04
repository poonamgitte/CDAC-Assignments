package ads.genericqueue;

public class GenericLinearQueue<T> implements Queue<T> {
	T[] queueData;
	int front;
	int rear;
	
	public GenericLinearQueue(int n) {
		queueData = (T[])new Object[n];
		this.front = -1;
		this.rear = -1;
	}
	

	@Override
	public void enqueue(T element) throws QueueException {
		if(isFull()) {
			//System.out.println("Queue is full");
			throw new QueueException("Queue is full");
		}
		
		if(front == -1) {
			front = 0;
		}
		
		rear++;
		queueData[rear] = element;
	}

	
	@Override
	public T dequeue() throws QueueException {
		
		if(isEmpty()) {
			//System.out.println("Queue is empty");
			throw new QueueException("Queue is empty");
		}
		
		T tempData = queueData[front];
		
		front++;
		
		return tempData;
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
		
		if(front == -1 || front>rear)
			return true;
		
		return false;
	}
	
	void display() {
		for(int i=front; i<=rear;i++) {
			System.out.print(queueData[i]+" ");
		}
		System.out.println();
	}

}
