package cdac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyCount {
	public static void main(String[] args) {

		String inputFile = "D:\\cdac\\java\\day10\\src\\cdac\\input.txt";
		String outputFile = "D:\\cdac\\java\\day10\\src\\cdac\\output.txt";

		// Map to store word->count
		Map<String, Integer> freqMap = new HashMap<>();

		// Read the input file and build frequency map
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile))) {
			String line;
			while ((line = reader.readLine()) != null) {

				// Normalize:convert to lower case
				line = line.toLowerCase();

				// Split into words:use regex to split on any non-letter characters
				// This keeps only sequences of a-z characters as words

				String[] words = line.split("[^a-z]+");

				for (String w : words) {
					if (w.isEmpty())
						continue; // skip empty tokens
					freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
				}
			}
		} catch (IOException e) {
			System.err.println("Error reading input file: " + e.getMessage());
			return;
		}

		// prepare alphabetical (soretd by word )map using TreeMap
		Map<String, Integer> alphaMap = new TreeMap<>(freqMap);

		// prepare a list of entries for frequency sorting
		List<Map.Entry<String, Integer>> freqList = new ArrayList<>(freqMap.entrySet());

		// Sort by frequency descending ,then by word ascending as tie-breaker
		freqList.sort((e1, e2) -> {
			int cmp = Integer.compare(e2.getValue(), e1.getValue()); // freq descending
			if (cmp != 0)
				return cmp;
			return e1.getKey().compareTo(e2.getKey()); // word ascending
		});

		// Write results to output file
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {

			writer.write("ALPHABETICAL LIST (word : count)\n");
			writer.write("---------------------------------\n");
			for (Map.Entry<String, Integer> e : alphaMap.entrySet()) {
				writer.write(String.format("%s : %d%n", e.getKey(), e.getValue()));
			}

			writer.write("\n\nFREQUENCY SORTED LIST (most frequent first)\n");
			writer.write("------------------------------------------------\n");
			for (Map.Entry<String, Integer> e : freqList) {
				writer.write(String.format("%s : %d%n", e.getKey(), e.getValue()));
			}

			System.out.println("Output written to: " + outputFile);

		} catch (IOException e) {
			System.err.println("Error writing output file: " + e.getMessage());
		}
	}
}
