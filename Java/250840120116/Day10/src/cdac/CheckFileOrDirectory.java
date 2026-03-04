package cdac;

import java.io.File;

public class CheckFileOrDirectory {
	public static void main(String[] args) {
		File file = new File("D:\\cdac\\java\\Practice\\src");
		
		if(file.exists()) {
			if(file.isFile())
				System.out.println("IT IS A FILE");
			else if(file.isDirectory())
				System.out.println("It is a directory");		
		}else {
			System.out.println("File not found");
		}
	}
}
