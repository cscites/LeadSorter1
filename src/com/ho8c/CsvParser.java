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
        Scanner scanner1 = new Scanner(csvFile).useDelimiter("\\n");
        scanner1.next();
        StringBuilder string = new StringBuilder();
        StringBuilder fixString = new StringBuilder();
        scanner.useDelimiter("\\n");
        string.append(scanner.next());

        lineTrim(string);
        String headerString = string.toString();
        int sizingNum = headerString.replaceAll(",", "").length()-1;
        int z = headerString.length() - sizingNum;
        headerArray = new String[z];
        lineParser(string,headerArray);

        string.setLength(0);

        while(scanner.hasNext()) {
            string.append(scanner.next());
            String[] variables = new String[z];
            lineTrim(string);
            if(Character.toString(string.charAt(0)).matches("'") ||
                    Character.toString(string.charAt(0)).matches("\"")){
                for (String last: variableSets.get(variableSets.size()-1)) {
                    fixString.append(last);
                }
                fixString.reverse();
                lineTrim(fixString);
                fixString.reverse();
                fixString.append(string);
                lineParser(fixString, variables);
                variableSets.remove(variableSets.size()-1);
                variableSets.add(variables);
                fixString.setLength(0);
                string.setLength(0);
            }
            else {
                lineParser(string,variables);
                variableSets.add(variables);
                string.setLength(0);
            }

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

    private void lineParser(StringBuilder string, String[] variables){
        int n = variables.length - 1;
        while (n >= 0) {
            if (string.lastIndexOf(",") == -1) {
                variables[n] = string.toString().trim();
                string.setLength(0);
            } else if (string.substring(string.length() - 1).matches("\"")) {
                string.setLength(string.lastIndexOf("\""));
                variables[n] = string.substring(string.lastIndexOf("\"") + 1, string.length()).trim();
                string.setLength(string.lastIndexOf("\"") - 1);
            } else {
                variables[n] = string.substring(string.lastIndexOf(",") + 1, string.length()).trim();
                string.setLength(string.lastIndexOf(","));
            }
            n--;
        }

    }

    ArrayList<String[]> getVariableSets(){
        return variableSets;
    }

    String[] getHeaders(){
        return headerArray;
    }

}
