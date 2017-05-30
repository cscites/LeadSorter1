package com.ho8c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chris on 5/29/17.
 */
public class CsvParser extends ArrayList<String[]> {
    private ArrayList<String[]> variableSets  = new ArrayList<>();
    public CsvParser(String csvFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(csvFile));
        scanner.useDelimiter("\\n");
        String headerString = scanner.next();
        int sizingNum = headerString.replaceAll(",", "").length()-1;
        int z = headerString.length() - sizingNum;
        System.out.println(z);

        while(scanner.hasNext()) {
            String line = scanner.next();
            String[] variables = new String[z];
            int n = variables.length - 1;
            while (n >= 0) {
                if (line.lastIndexOf(",") == -1) {
                    variables[n] = line.trim();
                    n--;
                } else if (line.substring(line.length() - 1).matches("\"")) {
                    line = line.substring(0, line.lastIndexOf("\""));
                    variables[n] = line.substring(line.lastIndexOf("\"") + 1, line.length()).trim();
                    line = line.substring(0, line.lastIndexOf("\"") - 1);
                    n--;
                } else {
                    variables[n] = line.substring(line.lastIndexOf(",") + 1, line.length()).trim();
                    line = line.substring(0, line.lastIndexOf(","));
                    n--;
                }
            }
            variableSets.add(variables);
        }

    }

    ArrayList<String[]> getVariableSets(){
        return variableSets;
    }

}
