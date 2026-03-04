
public class DecrementThread implements Runnable{
	
	Data objData;
	
	

	public DecrementThread(Data objData) {
		super();
		this.objData = objData;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			try {
				synchronized (objData) {
					System.out.println("Decrement..."+ --objData.value);
					
						Thread.sleep(10);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
