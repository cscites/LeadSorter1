package com.ho8c;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by chris on 5/29/17.
 */
public class CsvParser extends ArrayList<String[]> {
    private String[] headerArray;
    private ArrayList<CSVRecord> variableSets  = new ArrayList<>();


    public CsvParser(String csvFile) throws IOException {

        File csv = new File(csvFile);
        Reader in = new FileReader(csv);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(in);


        for(CSVRecord record:records){
            variableSets.add(record);
        }

        int n = variableSets.get(0).size();
        headerArray = new String[n];
        int a = 0;
        while (a < n){
            headerArray[a] = variableSets.get(0).get(a);
            a++;
        }

        variableSets.remove(0);

        in.close();

    }

    ArrayList<CSVRecord> getVariableSets(){
        return variableSets;
    }

    String[] getHeaders(){
        return headerArray;
    }

}
