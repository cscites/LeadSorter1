package com.ho8c;

import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by chris on 5/23/17.
 */
class LeadSetCreator {
    private ArrayList<Lead>leads = new ArrayList<>();
    private String[] headers;
    private String[] checkHeaders = {"Source","Specialty","Conference","Date","Prefix","First_Name","Middle_Name",
                                        "Last_Name","Degree","Company","Address_1","Address_2","City","State","Zip_Code",
                                        "Country","Phone","Fax","E-Mail","Notes","Geographic_Interest","Available","Status"};

    LeadSetCreator(String source) throws IOException, ArrayIndexOutOfBoundsException {
        CsvParser leadSet = new CsvParser(source);
        headers = leadSet.getHeaders();

        int n = 0;
        if(headers.length != checkHeaders.length){
            System.out.println("Improper template, wrong number of headers");
            System.exit(0);

        }
        for (String foundHeaders: headers) {
            if(!foundHeaders.matches(checkHeaders[n])){
                System.out.println(checkHeaders[n] + " header is incorrect.");
                System.out.print("Correct headers are: ");
                for (String correct: checkHeaders) {
                    System.out.print(correct + " | ");
                }
                System.out.println();
                System.out.print("Headers in file are: ");
                for (String incorrect: headers) {
                    System.out.print(incorrect + " | ");
                }
                System.out.println("Improper template");
                break;
            }
            n++;
        }




        ArrayList<CSVRecord> variables = leadSet.getVariableSets();




        for (CSVRecord var: variables){

            Lead candidate = new Lead(var.get(0), var.get(1), var.get(2), var.get(3), var.get(4), var.get(5), var.get(6),
                    var.get(7), var.get(8), var.get(9), var.get(10), var.get(11), var.get(12), var.get(13), var.get(14),
                    var.get(15), var.get(16), var.get(17), var.get(18), var.get(19), var.get(20), var.get(21), var.get(22));
            leads.add(candidate);

        }
    }


    ArrayList<Lead> getLeadSet(){
        return leads;
    }

    String[] getHeaders(){
        return headers;
    }
}