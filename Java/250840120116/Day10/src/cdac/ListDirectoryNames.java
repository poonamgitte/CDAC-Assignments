package cdac;

import java.io.File;

public class ListDirectoryNames {
	public static void main(String[] args) {
		File folder = new File("D:\\CDAC\\JAVA");
		
		String[] files= folder.list();
		
		for(String folderName:files)
			System.out.println(folderName);
		
		
		
	}
}
