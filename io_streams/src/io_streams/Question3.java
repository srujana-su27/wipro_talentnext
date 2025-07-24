package io_streams;
import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Question3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the input file name:");
	        String inputFile = scanner.nextLine();

	        System.out.println("Enter the output file name:");
	        String outputFile = scanner.nextLine();
	        Map<String, Integer> wordCount = new TreeMap<>();

	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
	            String line;

	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\s+");

	                for (String word : words) {
	                    word = word.replaceAll("[^a-zA-Z]", ""); 
	                    if (!word.isEmpty()) {
	                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("Input file not found: " + inputFile);
	            return;
	        } catch (IOException e) {
	            System.out.println("Error reading the input file: " + e.getMessage());
	            return;
	        }
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
	            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	                writer.write(entry.getKey() + " : " + entry.getValue());
	                writer.newLine();
	            }
	            System.out.println("Word count has been written to " + outputFile);
	        } catch (IOException e) {
	            System.out.println("Error writing to the output file: " + e.getMessage());
	        }

	        scanner.close();
	    }
	}
