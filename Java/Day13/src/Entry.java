
public class Entry {
	public static void main(String[] args) {
		
		Data objData = new Data() ;

		// 1st Way Using Extending thread
		IncrementThread incrementThread = new IncrementThread(objData);
		//incrementThread.setDaemon(true);
		incrementThread.start();

		// 2nd way using interface Runnable
		DecrementThread decrementThread = new DecrementThread(objData);
		Thread objThread = new Thread(decrementThread);
		//objThread.setDaemon(true);
		objThread.start();

		// Using lambda functions
//		Runnable lambdaThread = () -> {
//			for(int iTmp=0;iTmp<100;iTmp++){
//				System.out.println("In Lambda Thread");
//				try {
//					Thread.sleep(20);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		};    
//
//		Thread objLambda = new Thread(lambdaThread);
//		objLambda.start();
		
		
		// Using anonymous class 
		
//		Runnable anonyClassTread = new Runnable() {
//				
//			@Override
//			public void run() {
//				
//				while(true) {
//					System.out.println("In anonymous Class");
//					try {
//						Thread.sleep(20);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		};
//		
//		Thread objAnonyClass = new Thread(anonyClassTread);
//		
//		objAnonyClass.start();
//		

//		while (true) {
//			System.out.println("In main");
//			try {
//				Thread.sleep(20);
//			} catch (InterruptedException e) {`
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
