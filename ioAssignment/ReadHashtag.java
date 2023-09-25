package ioAssignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadHashtag {
    public static void main(String[] args) {
        String inputFile = "D:\\\\IO_Assignment\\PopularHashTags.txt";
       
        try ( FileReader file=new FileReader(inputFile);
        	BufferedReader reader = new BufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.startsWith("#")) {
                        System.out.println(word);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
