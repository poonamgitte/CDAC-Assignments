
public class IncrementThread extends Thread{
	
	Data objData;
	
	public IncrementThread(Data objData) {
		super();
		this.objData = objData;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			try {
				synchronized (objData) {
					System.out.println("Increment...."+ ++objData.value);
					
						Thread.sleep(10);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	}
}
