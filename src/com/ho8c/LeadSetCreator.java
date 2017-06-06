package com.ho8c;

import java.io.FileNotFoundException;
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
    LeadSetCreator(String source) throws FileNotFoundException {
        CsvParser leadSet = new CsvParser(source);
        headers = leadSet.getHeaders();

        int n = 0;
        for (String foundHeaders: headers) {
            if(!foundHeaders.matches(checkHeaders[n]) || n > checkHeaders.length - 1){
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


        ArrayList<String[]> variables = leadSet.getVariableSets();




        for (String[] var: variables){
            if(var.length == 23){
                Lead candidate = new Lead(var[0], var[1], var[2], var[3], var[4], var[5], var[6],
                        var[7], var[8], var[9], var[10], var[11], var[12], var[13], var[14], var[15],
                        var[16], var[17], var[18], var[19], var[20], var[21], var[22]);
                leads.add(candidate);
            }
        }
    }


    ArrayList<Lead> getLeadSet(){
        return leads;
    }

    String[] getHeaders(){
        return headers;
    }
}