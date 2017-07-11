package task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Main class for 2nd task
 */
public class Main {
    public static void main(String[] args) {

        Map<String,Integer> keyWordCounter = new HashMap<>();
        File keywords = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/keywords");
        File source = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/code.java");
        File output = new File("/home/kpkshke/Documents/IntellijProjects/EpamTraining/JavaFundamentals/io/src/main/resources/output.txt");

        readKeyWords(keywords, keyWordCounter);
        System.out.println(keyWordCounter);
        readSourceFile(source, keyWordCounter);
        System.out.println(keyWordCounter);


    }

    private static void readKeyWords (File file, Map<String,Integer> keyWordCounter) {
        String[] lines = readFromFileToStringBuilder(file).toString().split("\\n");

        for(String string : lines) {
            keyWordCounter.put(string, 0);
        }
    }

    private static void readSourceFile (File file, Map<String,Integer> keyWordCounter) {
        String[] strings = readFromFileToStringBuilder(file).toString().split("\\s");

        for (String string : strings) {
            if (keyWordCounter.containsKey(string)) {
                keyWordCounter.put(string, keyWordCounter.get(string) + 1);
            }
        }
    }

    private static StringBuilder readFromFileToStringBuilder (File file) {
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
                String s;
                StringBuilder out = new StringBuilder();
                while ((s = br.readLine()) != null) {
                    out.append(s).append("\n");
                }

                return out;
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            return new StringBuilder();
        }
    }

}
