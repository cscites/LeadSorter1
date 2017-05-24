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

            scanner.nextLine();
            while(scanner.hasNextLine()){
                String showSource = scanner.next();
                String specialty = scanner.next();
                String conference = scanner.next();
                String date = scanner.next();
                String prefix = scanner.next();
                String firstName = scanner.next();
                String middleName = scanner.next();
                String lastName = scanner.next();
                String degree = scanner.next();
                String company = scanner.next();
                String address1 = scanner.next();
                String address2 = scanner.next();
                String city = scanner.next();
                String state = scanner.next();
                String zip = scanner.next();
                String country = scanner.next();
                String phone = scanner.next();
                String fax = scanner.next();
                String email = scanner.next();
                String notes = scanner.next();
                String geoInt = scanner.next();
                String availability = scanner.next();
                String status = scanner.next();
                Lead candidate = new Lead(showSource, specialty, conference, date, prefix, firstName, middleName,
                        lastName, degree, company, address1, address2, city, state, zip, country, phone, fax,
                        email, notes, geoInt, availability, status);
                leads.add(candidate);
                scanner.nextLine();
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
