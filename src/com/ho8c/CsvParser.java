package com.ho8c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chris on 5/29/17.
 */
public class CsvParser extends ArrayList<String[]> {
    private String[] headerArray;
    private ArrayList<String[]> variableSets  = new ArrayList<>();
    public CsvParser(String csvFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(csvFile));
        StringBuilder string = new StringBuilder();
        scanner.useDelimiter("\\n");
        string.append(scanner.next());

        lineTrim(string);

        String headerString = string.toString();

        int sizingNum = headerString.replaceAll(",", "").length()-1;
        int z = headerString.length() - sizingNum;

        headerArray = new String[z];
        int n = headerArray.length - 1;
        while (n >= 0) {
            lineParser(string, headerArray, n);
            n--;
        }

        string.setLength(0);

        while(scanner.hasNext()) {
            string.append(scanner.next());
            String[] variables = new String[z];
            n = variables.length - 1;

            lineTrim(string);

            while (n >= 0) {
                lineParser(string, variables, n);
                n--;
            }
            variableSets.add(variables);
            string.setLength(0);
        }

    }

    private void lineTrim (StringBuilder string){
        while(Character.isWhitespace(string.charAt(string.length()-1))){
            string.setLength(string.length()-1);
        }

        while (Character.toString(string.charAt(string.length()-1)).matches(",")){
            string.setLength(string.length()-1);
        }
    }

    private void lineParser(StringBuilder string, String[] variables, int n){
        if (string.lastIndexOf(",") == -1) {
            while(Character.isWhitespace(string.charAt(string.length()-1))){
                string.setLength(string.length()-1);
            }
            variables[n] = string.toString();
        } else if (string.substring(string.length() - 1).matches("\"")) {
            string.setLength(string.lastIndexOf("\""));
            variables[n] = string.substring(string.lastIndexOf("\"") + 1, string.length()).trim();
            string.setLength(string.lastIndexOf("\"") - 1);
        } else {
            variables[n] = string.substring(string.lastIndexOf(",") + 1, string.length()).trim();
            string.setLength(string.lastIndexOf(","));
        }
    }

    ArrayList<String[]> getVariableSets(){
        return variableSets;
    }

    public String[] getHeaders(){
        return headerArray;
    }

}
