package ads.queue;

public class QueueClass<T> implements QueueInterface<T>{
	
	T queueData[] ;
	int front;
	int rear;
	int size ;
	
	public QueueClass(int size){
		queueData = (T[])new Object[size];
		front = -1;
		rear = -1;
		this.size = size;
	}

	@Override
	public void enqueue(T data) {
		
		if(isFull()) {
			
			System.out.println("Queue is full");
			return ;
		}
		
		if(front == -1) {
			front = 0;
		}
		rear = rear+1;
		
		queueData[rear] = data;	
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		T temp = queueData[front];
		
		front = front+1;
		
		if(front > rear) {
			front = -1;
			rear = -1;
		}
		
		return temp;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		
		if(front ==-1 || front>rear) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		
		if(rear == size-1) {
			return true;
		}
		return false;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return queueData[front];
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue empty");
			return;
		}
		
		for(int i = front; i<=rear;i++) {
			System.out.print(queueData[i]+" ");
		}
		
		System.out.println();
	}

}
