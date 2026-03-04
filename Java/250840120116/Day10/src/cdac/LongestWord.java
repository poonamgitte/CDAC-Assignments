package cdac;

import java.io.File;
import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		String path="D:\\cdac\\java\\practice\\src\\output.txt";
		String longestWord="";
		
		try (Scanner sc = new Scanner(new File(path))){
			while(sc.hasNext()) {
				String word = sc.next();
				if(word.length()>longestWord.length()) {
					longestWord=word;
				}
			}
			System.out.println("Longest word:"+longestWord);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
