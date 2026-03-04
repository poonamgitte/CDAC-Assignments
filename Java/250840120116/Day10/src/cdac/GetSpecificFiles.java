package cdac;

import java.io.File;

public class GetSpecificFiles {
	public static void main(String[] args) {
		File folder = new File("D:\\cdac\\java\\practice\\src");
		String extension = ".txt";
		
		if(folder.exists()&&folder.isDirectory()) {
			File[] files = folder.listFiles((dir,name)->name.endsWith(extension));
			
			if(files != null &&files.length>0) {
				System.out.println("Files with extension"+extension+":");
				for(File file:files) {
					System.out.println(file.getName());
				}
			}else {
				System.out.println("No files with that extention found!");
			}
		}
	}
}
