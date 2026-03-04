package cdac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		File source = new File("D:\\cdac\\java\\practice\\output.txt");
		File dest = new File("D:\\cdac\\java\\practice\\output.txt");

		try (FileInputStream fileInput = new FileInputStream(source);
				FileOutputStream fileOutput = new FileOutputStream(dest)) {

			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = fileInput.read(buffer)) != -1) {
				fileOutput.write(buffer, 0, bytesRead);
			}
			System.out.println("File copies sucessfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
