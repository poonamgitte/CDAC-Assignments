package cdac;

import java.io.File;

public class CheckFileExistance {
	public static void main(String[] args) {
		File file=new File("D:\\cdac\\java\\practice\\src\\output.txt");
		
		if(file.exists()) {
			System.out.println("File or directory exists!");
		}else {
			System.out.println("File or directory does not exixts!");
		}
	}
}
