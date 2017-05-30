package com.ho8c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by chris on 5/23/17.
 */
public class LeadSetCreator {
    private HashSet<Lead>leads = new HashSet<>();
    private Lead testLead;
    public LeadSetCreator(String source) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(source));
        scanner.useDelimiter(",|\\n");
        testLead = new Lead(scanner.next(), scanner.next(), scanner.next(), scanner.next(),
                scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(),
                scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(),
                scanner.next(), scanner.next(), scanner.next(), scanner.next(), scanner.next(),
                scanner.next(), scanner.next(), scanner.next(), scanner.next());
        System.out.println(testLead.getSource() + " " + testLead.getAvailability()  + " " + testLead.getStatus());
        if(testLead.getSource().matches("Source") && testLead.getSpecialty().matches("Specialty") &&
                testLead.getConference().matches("Conference") && testLead.getDate().matches("Date") &&
                testLead.getPrefix().matches("Prefix") && testLead.getFirstName().matches("First_Name") &&
                testLead.getMiddleName().matches("Middle_Name") && testLead.getLastName().matches("Last_Name") &&
                testLead.getDegree().matches("Degree") && testLead.getCompany().matches("Company") &&
                testLead.getAddress1().matches("Address_1") && testLead.getAddress2().matches("Address_2") &&
                testLead.getCity().matches("City") && testLead.getState().matches("State") &&
                testLead.getZip().matches("Zip_Code") && testLead.getCountry().matches("Country") &&
                testLead.getPhone().matches("Phone") && testLead.getFax().matches("Fax") &&
                testLead.getEmail().matches("E-Mail") && testLead.getNotes().matches("Notes") &&
                testLead.getGeoInt().matches("Geographic_Interest") &&
                testLead.getAvailability().matches("Available") && testLead.getStatus().matches("Status")){

            ArrayList<String[]> variables = new CsvParser(source).getVariableSets();

            for (String[] var: variables){
                if(var.length == 23){
                    Lead candidate = new Lead(var[0], var[1], var[2], var[3], var[4], var[5], var[6],
                            var[7], var[8], var[9], var[10], var[11], var[12], var[13], var[14], var[15],
                            var[16], var[17], var[18], var[19], var[20], var[21], var[22]);
                    leads.add(candidate);
                }
            }

        }
        else{
            System.out.println("Improper template");
        }
        scanner.close();
    }


    HashSet getLeadSet(){
        return leads;
    }

    public Lead getHeaders(){
        return testLead;
    }
}