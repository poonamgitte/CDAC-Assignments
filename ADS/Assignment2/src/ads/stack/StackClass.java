package ads.stack;

public class StackClass implements StackInterface{

	int[] stackData;
	int top;
	

	public StackClass(int size) {
		stackData = new int[size];
		this.top = -1;
	}

	public int[] resize(int[] stackData) {
		
		int[] newStackData= new int[stackData.length+5];
		
		System.arraycopy(stackData,0, newStackData,0,top+1);
//		for(int i=0;i<newStackData.length;i++) {
//			
//			System.out.println(newStackData[i]);
//		}
		return newStackData;
		
		
		
	}
	
	
	@Override
	public void push(int element) {
		
		if(isFull()) {
			//throw new Exception("Stack is full");
			stackData=resize(stackData);
		}
		
		top++;
		stackData[top] = element;
	}

	@Override
	public int pop() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("Stack is empty");
		}
		int temp=stackData[top];
		top--;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == stackData.length-1) {
			return true;
		}
		return false;
	}
	
	public void display() {
		for(int i=0;i<stackData.length;i++) {
			System.out.print(" " +stackData[i]);
		}
		System.out.println();
	}
	
	

}
