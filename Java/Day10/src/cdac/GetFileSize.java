package cdac;

import java.io.File;

public class GetFileSize {
	public static void main(String[] args) {
		File file = new File("D:\\cdac\\java\\practice\\src\\output.txt");
		
		if(file.exists()&&file.isFile()) {
			long bytes = file.length();
			double kb= bytes/1024.0;
			double mb = kb/1024.0;
			
			System.out.println("File Size in byte:"+bytes+" KB="+kb+" mb="+mb);
		}else {
			System.out.println("File does not exists");
		}
	}
}
