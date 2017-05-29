package com.ho8c;

import java.io.File;
import java.io.FileNotFoundException;
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

            /** scanner.nextLine();
            scanner.reset();
            scanner.useDelimiter("\\n");
            int a = 1;
            while(scanner.hasNextLine()){
                String test = scanner.next();
                a++;
                String[] variables = new String[23];
                int n = variables.length - 1;
                while (n >= 0){
                    if(test.lastIndexOf(",") == -1){
                        variables[n] = test.trim();
                        n--;
                    }else if(test.substring(test.length()-1).matches("\"")){
                        test = test.substring(0, test.lastIndexOf("\""));
                        variables[n] = test.substring(test.lastIndexOf("\"")+1, test.length()).trim();
                        test = test.substring(0, test.lastIndexOf("\"")-1);
                        n--;
                    }else{
                        variables[n] = test.substring(test.lastIndexOf(",")+1, test.length()).trim();
                        test = test.substring(0, test.lastIndexOf(","));
                        n--;
                    }
                }

                Lead candidate = new Lead(variables[0], variables[1], variables[2], variables[3],
                        variables[4], variables[5], variables[6], variables[7], variables[8],
                        variables[9], variables[10], variables[11], variables[12], variables[13],
                        variables[14], variables[15], variables[16], variables[17], variables[18],
                        variables[19], variables[20], variables[21], variables[22]);
                leads.add(candidate);
                scanner.nextLine();
            }**/

            HashSet<String[]>variables = new CsvParser("/home/chris/Desktop/AAN 2017/leads.csv").getVariableSets();

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